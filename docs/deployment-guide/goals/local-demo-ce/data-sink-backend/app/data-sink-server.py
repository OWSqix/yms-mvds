# data-sink-server.py
import uuid
from datetime import datetime
from fastapi import FastAPI
from typing import Dict, Any
import uvicorn
import json

app = FastAPI()
received_data = None  # 데이터를 저장할 변수

@app.post("/receive-data")
async def receive_data(data: Dict[str, Any]):
    """데이터를 수신하여 저장하는 엔드포인트"""
    global received_data
    received_data = data
    print("received data:", json.dumps(data, indent=2, ensure_ascii=False))
    return {
        "status": "completed",
        "success": True,
        "message": "Data transfer completed successfully",
        "id": str(uuid.uuid4()),  # 고유 ID 생성
        "receivedAt": datetime.now().isoformat()
    }

@app.get("/view-data")
def view_data():
    """저장된 데이터를 조회하는 엔드포인트"""
    return received_data if received_data else {"message": "No data received yet"}

@app.get("/")
def root():
    """루트 엔드포인트"""
    return {
        "message": "Data Sink API is running",
        "endpoints": {
            "/receive-data": "POST endpoint to receive data",
            "/view-data": "GET endpoint to view the latest received data"
        }
    }

@app.get("/health")
def health_check():
    """헬스체크 엔드포인트"""
    return {"status": "healthy"}

# 직접 서버 시작
if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)
else:
    # 이 부분은 uvicorn이 이 모듈을 로드할 때 실행됩니다
    print("서버가 시작되었습니다.")
