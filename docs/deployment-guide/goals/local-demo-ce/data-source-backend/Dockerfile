FROM python:3.12

WORKDIR /app

COPY ./app/data-source-server.py /app/

RUN pip install --no-cache-dir fastapi uvicorn

# 직접 Python 스크립트 실행
CMD ["python", "data-source-server.py"]
