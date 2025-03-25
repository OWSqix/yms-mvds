# data-source-server.py

from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware
from datetime import datetime
import uvicorn

# FastAPI 앱 생성
app = FastAPI(
    title="CCTV 데이터 API",
    description="EDC Connector용 CCTV 데이터 제공 백엔드 API",
    version="1.0.0"
)

# CORS 설정
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

# 기본 루트 엔드포인트
@app.get("/")
async def root():
    return {
        "message": "CCTV 데이터 API가 정상적으로 작동 중입니다",
        "timestamp": datetime.now().isoformat(),
        "version": "1.0.0",
        "available_endpoints": [
            "/",
            "/cctv-data",
            "/health"
        ]
    }

# CCTV 데이터 엔드포인트
@app.get("/cctv-data")
async def get_cctv_data():
    return {
        "url": "https://www.utic.go.kr/jsp/map/openDataCctvStream.jsp",
        "key": "WfUBsqJewI8raGdoHbYokJpZQyw0X1QR7AatNkDa9c",
        "cctvid": "L933113",
        "cctvName": "%EA%B0%95%EC%9B%90%20%EA%B0%95%EB%A6%89%20%EC%9A%A9%EA%B0%95%EB%8F%99",
        "kind": "KB",
        "cctvip": "9952",
        "cctvch": "undefined",
        "id": "undefined",
        "cctvpasswd": "undefined",
        "cctvport": "undefined"
    }

# 건강 상태 확인 엔드포인트
@app.get("/health")
async def health_check():
    return {
        "status": "healthy",
        "timestamp": datetime.now().isoformat()
    }

# 직접 서버 시작
if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8001)
else:
    # 이 부분은 uvicorn이 이 모듈을 로드할 때 실행됩니다
    print("서버가 시작되었습니다.")
