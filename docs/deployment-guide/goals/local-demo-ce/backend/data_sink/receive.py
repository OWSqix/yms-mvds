import os
import sys
import uuid
from datetime import datetime
from fastapi import APIRouter, Header, HTTPException, Request
from backend.data_sink.auth import validate_request_auth
from backend.data_sink.files import RECEIVED_DIR
from backend.common.logging_utils import setup_logger

# Set directory path to use common module
current_dir = os.path.dirname(os.path.abspath(__file__))
backend_dir = os.path.dirname(current_dir)
if backend_dir not in sys.path:
    sys.path.append(backend_dir)

logger = setup_logger("data_sink.receive")
router = APIRouter()

@router.post("/receive-file")
async def receive_file(
        request: Request,
        authorization: str = Header(default=None)
):

    logger.debug(f"Received authorization token: authorization={authorization}")
    logger.debug(f"All headers: {dict(request.headers)}")

    auth_info = await validate_request_auth(request, authorization)
    logger.info(f"Authentication success: method={auth_info.get('method')}, user={auth_info.get('user')}")

    content_type = request.headers.get("content-type", "application/octet-stream")
    logger.debug(f"Received content-type: {content_type}")

    body = await request.body()
    if not body:
        raise HTTPException(status_code=400, detail="CANNOT FIND ANY FILE DATA")

    # File size limit code(1gb). Activate if you need :)
    # if len(body) > 1024 * 1024 * 1024:
    #     raise HTTPException(status_code=413, detail="FILE IS TOO BIG")

    filename = None
    content_disposition = request.headers.get("content-disposition")
    if content_disposition and "filename=" in content_disposition:
        try:
            filename = content_disposition.split("filename=")[1].strip('"\'')
        except Exception as e:
            logger.warning(f"content-disposition parse failed: {e}")

    # If failed to parse filename then generate unique filename with timestamp and uuid
    if not filename:
        timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
        unique_id = str(uuid.uuid4())[:8]

        # Comprehensive file extension mapping based on content-type
        extension = "bin"  # Default fallback
        
        # Text formats
        if "application/json" in content_type or "json" in content_type:
            extension = "json"
        elif "application/xml" in content_type or "text/xml" in content_type or "xml" in content_type:
            extension = "xml"
        elif "text/plain" in content_type or "text/" in content_type:
            extension = "txt"
        elif "text/html" in content_type:
            extension = "html"
        elif "text/css" in content_type:
            extension = "css"
        elif "text/javascript" in content_type or "application/javascript" in content_type:
            extension = "js"
        elif "text/csv" in content_type:
            extension = "csv"
        
        # Video formats
        elif "video/mp4" in content_type:
            extension = "mp4"
        elif "video/avi" in content_type:
            extension = "avi"
        elif "video/quicktime" in content_type:
            extension = "mov"
        elif "video/x-msvideo" in content_type:
            extension = "avi"
        elif "video/webm" in content_type:
            extension = "webm"
        elif "video/x-flv" in content_type:
            extension = "flv"
        elif "video/3gpp" in content_type:
            extension = "3gp"
        elif "video/" in content_type:
            extension = "mp4"  # Default video extension
        
        # Audio formats
        elif "audio/mpeg" in content_type:
            extension = "mp3"
        elif "audio/wav" in content_type:
            extension = "wav"
        elif "audio/x-wav" in content_type:
            extension = "wav"
        elif "audio/ogg" in content_type:
            extension = "ogg"
        elif "audio/mp4" in content_type:
            extension = "m4a"
        elif "audio/flac" in content_type:
            extension = "flac"
        elif "audio/" in content_type:
            extension = "mp3"  # Default audio extension
        
        # Image formats
        elif "image/jpeg" in content_type:
            extension = "jpg"
        elif "image/png" in content_type:
            extension = "png"
        elif "image/gif" in content_type:
            extension = "gif"
        elif "image/webp" in content_type:
            extension = "webp"
        elif "image/svg+xml" in content_type:
            extension = "svg"
        elif "image/bmp" in content_type:
            extension = "bmp"
        elif "image/tiff" in content_type:
            extension = "tiff"
        elif "image/" in content_type:
            extension = "jpg"  # Default image extension
        
        # Document formats
        elif "application/pdf" in content_type:
            extension = "pdf"
        elif "application/msword" in content_type:
            extension = "doc"
        elif "application/vnd.openxmlformats-officedocument.wordprocessingml.document" in content_type:
            extension = "docx"
        elif "application/vnd.ms-excel" in content_type:
            extension = "xls"
        elif "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" in content_type:
            extension = "xlsx"
        elif "application/vnd.ms-powerpoint" in content_type:
            extension = "ppt"
        elif "application/vnd.openxmlformats-officedocument.presentationml.presentation" in content_type:
            extension = "pptx"
        
        # Archive formats
        elif "application/zip" in content_type:
            extension = "zip"
        elif "application/x-rar-compressed" in content_type:
            extension = "rar"
        elif "application/x-tar" in content_type:
            extension = "tar"
        elif "application/gzip" in content_type:
            extension = "gz"
        elif "application/x-7z-compressed" in content_type:
            extension = "7z"
        
        # Other common formats
        elif "application/octet-stream" in content_type:
            extension = "bin"

        filename = f"edc_data_{timestamp}_{unique_id}.{extension}"

    save_path = os.path.join(RECEIVED_DIR, filename)
    try:
        os.makedirs(RECEIVED_DIR, exist_ok=True)

        with open(save_path, "wb") as f:
            f.write(body)
        logger.info(f"File saved in: {save_path}")
    except Exception as e:
        logger.error(f"Failed to save file: {e}")
        raise HTTPException(status_code=500, detail=str(e))

    return {
        "msg": "File is successfully transferred",
        "size": len(body),
        "filename": filename,
        "content_type": content_type
    }