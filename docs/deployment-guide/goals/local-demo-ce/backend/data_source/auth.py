# backend/data_source/auth.py - Improved Version with File-based Storage

import os
import sys
from fastapi import APIRouter, HTTPException, Depends, status, Request
from fastapi.security import OAuth2PasswordBearer
from datetime import datetime, timedelta
import jwt
from backend.data_source.models import UserCreate, UserLogin

current_dir = os.path.dirname(os.path.abspath(__file__))
backend_dir = os.path.dirname(current_dir)
if backend_dir not in sys.path:
    sys.path.append(backend_dir)

from backend.common.logging_utils import setup_logger
from backend.common.auth_store import (
    JWT_SECRET_KEY, JWT_ALGORITHM, ACCESS_TOKEN_EXPIRE_MINUTES,
    add_user, verify_user, get_user, save_token, validate_token
)

logger = setup_logger("data_source.auth")

router = APIRouter(prefix="/auth")

SECRET_KEY = os.environ.get("JWT_SECRET_KEY", JWT_SECRET_KEY)
ALGORITHM = JWT_ALGORITHM

oauth2_scheme = OAuth2PasswordBearer(tokenUrl="auth/login")


def get_current_user(token: str = Depends(oauth2_scheme)) -> str:
    try:
        # Use our validate_token function first
        username = validate_token(token)
        if username:
            logger.debug(f"Authenticated user via stored token: {username}")
            return username
            
        # If that fails, try the standard JWT decode
        payload = jwt.decode(token, SECRET_KEY, algorithms=[ALGORITHM])
        username: str = payload.get("sub")
        
        if username is None or not get_user(username):
            logger.warning(f"Invalid username in token or user not found: {username}")
            raise HTTPException(status_code=401, detail="Invalid authentication credentials")

        exp = payload.get("exp")
        if exp is None or datetime.utcnow() > datetime.fromtimestamp(exp):
            logger.warning(f"Token expired for user: {username}")
            raise HTTPException(status_code=401, detail="Token has expired")

        logger.debug(f"Authenticated user: {username}")
        return username
    except jwt.ExpiredSignatureError:
        logger.warning("Token has expired")
        raise HTTPException(status_code=401, detail="Token has expired")
    except jwt.PyJWTError as e:
        logger.error(f"JWT validation error: {str(e)}")
        raise HTTPException(status_code=401, detail="Could not validate credentials")


@router.post("/register", status_code=201)
def register_user(user: UserCreate):
    logger.info(f"Registration attempt for username: {user.username}")

    if get_user(user.username):
        logger.warning(f"Registration failed: Username already exists: {user.username}")
        raise HTTPException(status_code=400, detail="Username already registered")

    if len(user.password) < 6:
        logger.warning(f"Registration failed: Password too short for user: {user.username}")
        raise HTTPException(status_code=400, detail="Password must be at least 6 characters")

    success = add_user(user.username, user.password)
    if not success:
        logger.error(f"Failed to register user: {user.username}")
        raise HTTPException(status_code=500, detail="Failed to register user")

    logger.info(f"User registered successfully: {user.username}")
    return {"msg": f"User '{user.username}' registered successfully."}


@router.post("/login")
def login(user: UserLogin):
    logger.info(f"Login attempt for username: {user.username}")

    if not verify_user(user.username, user.password):
        logger.warning(f"Login failed: Invalid credentials for user: {user.username}")
        raise HTTPException(status_code=401, detail="Invalid username or password")

    # Create token
    expire_time = datetime.utcnow() + timedelta(minutes=ACCESS_TOKEN_EXPIRE_MINUTES)
    expire_timestamp = expire_time.timestamp()
    
    payload = {
        "sub": user.username,
        "exp": expire_timestamp,
        "iat": datetime.utcnow().timestamp(),
    }
    token = jwt.encode(payload, SECRET_KEY, algorithm=ALGORITHM)
    
    # Save token to file storage
    save_token(user.username, token, expire_timestamp)

    logger.info(f"User logged in successfully: {user.username}")
    logger.debug(f"Token issued for user: {user.username}, expires in {ACCESS_TOKEN_EXPIRE_MINUTES} minutes")

    return {
        "token": token,
        "token_type": "bearer",
        "expires_in": ACCESS_TOKEN_EXPIRE_MINUTES * 60
    }

@router.get("/token-info")
def token_info(request: Request):
    """Get information about the current authentication token (for testing)"""
    auth_header = request.headers.get("Authorization")
    
    if not auth_header or not auth_header.startswith("Bearer "):
        return {"authenticated": False, "message": "No valid authentication token provided"}
    
    token = auth_header.replace("Bearer ", "")
    username = validate_token(token)
    
    if not username:
        return {"authenticated": False, "message": "Invalid or expired token"}
        
    return {
        "authenticated": True,
        "username": username,
        "message": "Token is valid"
    }