FROM python:3.12

WORKDIR /app

COPY ./app/data-sink-server.py /app/

RUN pip install --no-cache-dir fastapi uvicorn

# 직접 Python 스크립트 실행
CMD ["python", "data-sink-server.py"]
