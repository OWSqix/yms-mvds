# backend/data_sink/auth.py

import os
import jwt
import sys
from datetime import datetime
from fastapi import Depends, HTTPException, Request, Header, APIRouter
from fastapi.security import OAuth2PasswordBearer
from typing import Optional, Tuple, Dict, Any
from backend.common.logging_utils import setup_logger
from backend.common.auth_store import (
    JWT_SECRET_KEY, JWT_ALGORITHM, validate_token
)

current_dir = os.path.dirname(os.path.abspath(__file__))
backend_dir = os.path.dirname(current_dir)
if backend_dir not in sys.path:
    sys.path.append(backend_dir)

logger = setup_logger("data_sink.auth")

SECRET_KEY = os.environ.get("JWT_SECRET_KEY", JWT_SECRET_KEY)
ALGORITHM = os.environ.get("JWT_ALGORITHM", JWT_ALGORITHM)

oauth2_scheme = OAuth2PasswordBearer(tokenUrl="auth/login")
router = APIRouter(prefix="/auth")


def get_current_user(token: str = Depends(oauth2_scheme)) -> str:
    # First try file-based token validation
    username = validate_token(token)
    if username:
        logger.debug(f"Authenticated user via file-based token: {username}")
        return username
    
    # Fallback to JWT validation
    try:
        payload = jwt.decode(token, SECRET_KEY, algorithms=[ALGORITHM])
        username: str = payload.get("sub")
        if username is None:
            raise HTTPException(status_code=401, detail="Invalid token")

        exp = payload.get("exp")
        if exp is None or datetime.utcnow() > datetime.fromtimestamp(exp):
            raise HTTPException(status_code=401, detail="Token has expired")

        return username
    except jwt.ExpiredSignatureError:
        raise HTTPException(status_code=401, detail="Token has expired")
    except jwt.PyJWTError:
        raise HTTPException(status_code=401, detail="Could not validate credentials")


def validate_auth(
        authorization: Optional[str] = None
) -> Tuple[bool, Dict[str, Any]]:
    auth_info = {"method": None, "user": None}

    if authorization and authorization.startswith("Bearer "):
        effective_token = authorization.replace("Bearer ", "")
        
        # First try file-based validation
        username = validate_token(effective_token)
        if username:
            logger.debug(f"Successfully validated {username}'s token via file storage")
            auth_info["method"] = "file_token"
            auth_info["user"] = username
            return True, auth_info

        # Fallback to JWT validation
        try:
            payload = jwt.decode(effective_token, SECRET_KEY, algorithms=[ALGORITHM])
            username = payload.get("sub")
            exp = payload.get("exp")

            if not username:
                logger.warning("Omission 'sub' claim in JWT Token")
                return False, auth_info

            if exp and datetime.utcnow() > datetime.fromtimestamp(exp):
                logger.warning(f"{username}'s token is expired")
                return False, auth_info

            logger.debug(f"Successfully validated {username}'s token via JWT")
            auth_info["method"] = "jwt_token"
            auth_info["user"] = username
            return True, auth_info

        except jwt.ExpiredSignatureError:
            logger.warning("JWT token expired")
            return False, auth_info
        except jwt.PyJWTError as e:
            logger.warning(f"JWT validation error: {str(e)}")
            return False, auth_info

    logger.warning("Failed to validate JWT token")
    return False, auth_info


async def validate_request_auth(
        request: Request,
        authorization: str = Header(default=None)
) -> Dict[str, Any]:
    is_valid, auth_info = validate_auth(authorization)

    if not is_valid:
        logger.warning(f"Invalid access from IP {request.client.host}.")
        raise HTTPException(
            status_code=401,
            detail="Failed to validate JWT token"
        )

    return auth_info

@router.get("/token-info")
def token_info(request: Request):
    """Get information about the current authentication token (for testing)"""
    auth_header = request.headers.get("Authorization")
    
    if not auth_header or not auth_header.startswith("Bearer "):
        return {"authenticated": False, "message": "No valid authentication token provided"}
    
    token = auth_header.replace("Bearer ", "")
    is_valid, auth_info = validate_auth(token)
    
    if not is_valid:
        return {"authenticated": False, "message": "Invalid or expired token"}
        
    return {
        "authenticated": True,
        "username": auth_info["user"],
        "method": auth_info["method"],
        "message": "Token is valid"
    }