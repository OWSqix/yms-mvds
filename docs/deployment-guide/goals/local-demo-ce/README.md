# EDC (Eclipse Dataspace Connector) 로컬 데모 가이드

한국 교통분야 데이터스페이스를 위한 EDC 커넥터 시스템입니다. 4개 기관(Ymatics, KOTI, KALDA, KHU)이 안전하게 데이터를 공유할 수 있는 분산 시스템을 제공합니다.

## 📋 목차
- [시스템 개요](#-시스템-개요)
- [환경 구성](#-환경-구성)
- [접속 방법](#-접속-방법)
- [시스템 시작하기](#-시스템-시작하기)
- [데이터 자산 관리](#-데이터-자산-관리)
- [계약 및 데이터 전송](#-계약-및-데이터-전송)
- [API 엔드포인트 레퍼런스](#-api-엔드포인트-레퍼런스)
- [고급 설정](#-고급-설정)
- [문제 해결](#-문제-해결)

---

## 시스템 개요

### 
| 기관명 | 영문명 |
|---------|--------|------|
| **Ymatics** | Ymatics |
| **한국교통연구원** | KOTI |
| **한국국토교통데이터진흥협회회** |
| **경희대학교** | KHU |

### 시스템 아키텍처
- **EDC 커넥터**: 각 기관별 독립적인 데이터 커넥터
- **데이터 소스/싱크**: 파일 업로드/다운로드 시스템
- **웹 UI**: 직관적인 데이터 관리 인터페이스
- **Public API**: 간편한 데이터 전송을 위한 테스트용 공개 엔드포인트

---

## 환경 구성

### 개발 환경 vs 운영 환경

#### **개발 환경 (Development)**
- **목적**: 로컬 개발 및 테스트
- **네트워킹**: localhost 포트 매핑
- **이미지 태그**: `:dev`
- **접근성**: 외부에서 직접 포트 접근 가능

#### **운영 환경 (Production)**
- **목적**: 실제 서비스 배포
- **네트워킹**: Nginx 리버스 프록시
- **이미지 태그**: `:prod`
- **접근성**: 도메인 기반 접근

### 시스템 요구사항
- Docker & Docker Compose
- 최소 8GB RAM
- 20GB 이상 디스크 공간

---

## 🌐 접속 방법

### 개발 환경 (Development)

| 기관 | EDC UI | 데이터 소스 UI | 데이터 싱크 API |
|------|--------|----------------|-----------------|
| **Ymatics** | http://localhost:30000 | http://localhost:30010 | http://localhost:30001 |
| **KOTI** | http://localhost:30100 | http://localhost:30110 | http://localhost:30101 |
| **KALDA** | http://localhost:30200 | http://localhost:30210 | http://localhost:30201 |
| **KHU** | http://localhost:30300 | http://localhost:30310 | http://localhost:30301 |

### 운영 환경 (Production)

| 기관 | 도메인 | 포트 |
|------|--------|------|
| **전체 시스템** | http://api.data-space.kr | 8080 (HTTP), 8443 (HTTPS) |
| **Ymatics** | ymatics.data-space.kr | - |
| **KOTI** | koti.data-space.kr | - |
| **KALDA** | kalda.data-space.kr | - |
| **KHU** | khu.data-space.kr | - |

### 기본 로그인 정보
- **사용자명**: `ymsadmin/kotiadmin/kaldaadmin/khuadmin`
- **비밀번호**: `ymatics@2024`

---

## 🚀 시스템 시작하기

### 1단계: 저장소 클론 및 디렉토리 이동
```bash
cd docs/deployment-guide/goals/local-demo-ce
```

### 2단계: 환경 설정 확인
```bash
# 환경 변수 파일 확인
cat .env
```

### 3단계: Docker 컨테이너 시작

#### 개발 환경 시작
```bash
# 개발 환경 시작
docker compose -p edc-dev -f docker-compose.dev.yaml --env-file .env up -d

# 로그 확인
docker compose -p edc-dev logs -f
```

#### Prod 환경 시작
```bash
# Prod 환경 시작
docker compose -p edc-prod -f docker-compose.prod.yaml up -d

# Prod 확인
docker compose -p edc-prod logs -f
```

### 4단계: 시스템 상태 확인
```bash
# 개발 환경 컨테이너 상태 확인
docker compose -p edc-dev ps

# 운영 환경 컨테이너 상태 확인  
docker compose -p edc-prod ps

# 특정 서비스 로그 확인
docker compose -p edc-dev logs khu-backend
docker compose -p edc-prod logs khu-backend
```

---

## 📁 데이터 자산 관리

### 데이터 업로드

#### 1. 데이터 소스 UI 접속
각 기관별 데이터 소스 UI에 접속합니다:
- **KHU**: http://localhost:30310 (개발환경)

#### 2. 로그인
- 사용자명: `admin`
- 비밀번호: `admin`

#### 3. 파일 업로드
1. **"파일 업로드"** 버튼 클릭
2. 업로드할 파일 선택 (예: `Motion_gyojeon.zip`)
3. `uploaded/` 폴더에 자동 저장됨
4. 업로드 완료 확인

#### 4. 업로드된 파일 확인
```bash
# 파일 목록 API로 확인
curl "http://localhost:30302/files/" -H "Authorization: Bearer [토큰]"
```

### 데이터 자산 등록 (EDC UI에서)

#### 1. EDC UI 접속
- **KHU EDC**: http://localhost:30300

#### 2. 데이터 자산 생성
1. **"Data Offers"** 메뉴 선택
2. **"Create Data Offer"** 버튼 클릭
3. 다음 정보 입력:
   ```
   Asset ID: motion-gyojeon-dataset
   Asset Name: Motion Gyojeon Dataset
   Description: 교전 모션 데이터셋
   Content Type: application/zip
   ```

#### 3. 데이터 소스 URL 설정
**Public API 사용 (인증 불필요):**
```
http://khu-backend:8003/files/public/download?path=uploaded/Motion_gyojeon.zip
```

**기존 API 사용 (인증 필요):**
```
http://khu-backend:8003/files/download?path=uploaded/Motion_gyojeon.zip
```

---

## 🤝 계약 및 데이터 전송

### 1단계: 카탈로그에서 데이터 자산 검색

#### Consumer에서 Provider 데이터 검색
1. **Ymatics EDC UI** 접속: http://localhost:30000
2. **"Catalog Browser"** 메뉴 선택
3. **Provider 엔드포인트** 추가:
   ```
   http://khu/api/dsp
   ```
4. **"Browse"** 버튼 클릭
5. 사용 가능한 데이터 자산 목록 확인

### 2단계: 계약 협상 (Contract Negotiation)

#### 계약 요청 시작
1. 원하는 데이터 자산에서 **"Start Negotiation"** 클릭
2. 계약 조건 확인:
   - **Policy**: 데이터 사용 정책
   - **Usage Period**: 사용 기간
   - **Access Rights**: 접근 권한
3. **"Start Negotiation"** 버튼 클릭
4. 계약 상태가 **"CONFIRMED"**로 변경될 때까지 대기

#### 계약 상태 확인
- **"Contract Agreements"** 메뉴에서 진행 상황 모니터링
- 상태: `REQUESTED` → `AGREED` → `CONFIRMED`

### 3단계: 데이터 전송 (Transfer)

#### 전송 요청 설정
1. **"Contract Agreements"**에서 확정된 계약 선택
2. **"Start Transfer"** 버튼 클릭
3. **Transfer 설정**:

#### Public API 사용 (권장)
```json
{
  "transferType": "HttpProxy",
  "destination": {
    "type": "HttpData",
    "baseUrl": "http://consumer-backend:8002/public/receive-file"
  }
}
```

#### 기존 API 사용
```json
{
  "transferType": "HttpProxy", 
  "destination": {
    "type": "HttpData",
    "baseUrl": "http://consumer-backend:8002/receive-file",
    "authKey": "[인증토큰]"
  }
}
```

#### 4. 전송 시작
- **"Start Transfer"** 버튼 클릭
- 전송 진행 상황 모니터링

### 4단계: 전송 상태 확인

#### EDC UI에서 확인
1. **"Transfer History"** 메뉴 선택
2. 전송 상태 확인:
   - `REQUESTED`: 요청됨
   - `STARTED`: 시작됨  
   - `COMPLETED`: 완료됨
   - `ERROR`: 오류 발생

#### 로그로 확인
```bash
# 전송 로그 실시간 확인
docker logs -f edc-dev-khu-backend
docker logs -f edc-dev-consumer-backend
```

#### 수신된 파일 확인
```bash
# Consumer의 received 폴더 확인
docker exec edc-dev-consumer-backend ls -la /app/data/received/
```

---

## 🔗 API 엔드포인트 레퍼런스

### 포트 매핑 개요

#### 개발 환경 포트
| 기관 | Data Source API | Data Sink API | EDC Management API |
|------|-----------------|---------------|-------------------|
| **Ymatics** | 30002 | 30001 | 30000 |
| **KOTI** | 30102 | 30101 | 30100 |
| **KALDA** | 30202 | 30201 | 30200 |
| **KHU** | 30302 | 30301 | 30300 |

#### 내부 포트 (컨테이너 간 통신)
- **Data Source API**: 8003
- **Data Sink API**: 8002
- **EDC Management API**: 11000

### Data Source API (파일 다운로드)

#### 🔐 인증 관련 엔드포인트

**POST /auth/register** - 사용자 등록
```bash
curl -X POST "http://localhost:30302/auth/register" \
  -H "Content-Type: application/json" \
  -d '{
    "username": "testuser",
    "password": "testpass",
    "full_name": "Test User"
  }'
```

**POST /auth/login** - 로그인 및 토큰 발급
```bash
curl -X POST "http://localhost:30302/auth/login" \
  -H "Content-Type: application/json" \
  -d '{
    "username": "admin",
    "password": "ymatics@2024"
  }'
```

**GET /auth/token-info** - 토큰 정보 확인
```bash
curl "http://localhost:30302/auth/token-info" \
  -H "Authorization: Bearer YOUR_TOKEN"
```

#### 📁 파일 관리 엔드포인트

**GET /files/** - 디렉토리 목록 조회 (인증 필요)
```bash
curl "http://localhost:30302/files/" \
  -H "Authorization: Bearer YOUR_TOKEN"

# 하위 디렉토리 조회
curl "http://localhost:30302/files/?dir=uploaded" \
  -H "Authorization: Bearer YOUR_TOKEN"
```

**POST /files/** - 파일 업로드 (인증 필요)
```bash
curl -X POST "http://localhost:30302/files/" \
  -H "Authorization: Bearer YOUR_TOKEN" \
  -F "file=@/path/to/file.zip" \
  -F "dir=uploaded"
```

**POST /files/mkdir** - 디렉토리 생성 (인증 필요)
```bash
curl -X POST "http://localhost:30302/files/mkdir" \
  -H "Authorization: Bearer YOUR_TOKEN" \
  -H "Content-Type: application/json" \
  -d '{"path": "new_folder"}'
```

**DELETE /files/** - 파일/디렉토리 삭제 (인증 필요)
```bash
curl -X DELETE "http://localhost:30302/files/?path=uploaded/old_file.zip" \
  -H "Authorization: Bearer YOUR_TOKEN"
```

**GET /files/download** - 파일 다운로드 (인증 필요)
```bash
curl "http://localhost:30302/files/download?path=uploaded/Motion_gyojeon.zip" \
  -H "Authorization: Bearer YOUR_TOKEN" \
  --output Motion_gyojeon.zip
```

**🌐 GET /files/public/download** - Public 파일 다운로드 (인증 불필요)
```bash
curl "http://localhost:30302/files/public/download?path=uploaded/Motion_gyojeon.zip" \
  --output Motion_gyojeon.zip
```

### Data Sink API (파일 수신)

#### 🔐 인증 관련 엔드포인트

**GET /auth/token-info** - 토큰 정보 확인
```bash
curl "http://localhost:30301/auth/token-info" \
  -H "Authorization: Bearer YOUR_TOKEN"
```

#### 📥 파일 수신 엔드포인트

**POST /receive-file** - 파일 수신 (인증 필요)
```bash
curl -X POST "http://localhost:30301/receive-file" \
  -H "Authorization: Bearer YOUR_TOKEN" \
  -H "Content-Type: application/zip" \
  -H "Content-Disposition: filename=received_file.zip" \
  --data-binary @file.zip
```

**🌐 POST /public/receive-file** - Public 파일 수신 (인증 불필요)
```bash
curl -X POST "http://localhost:30301/public/receive-file" \
  -H "Content-Type: application/zip" \
  -H "Content-Disposition: filename=received_file.zip" \
  --data-binary @file.zip
```

#### 📁 수신된 파일 관리

**GET /files/** - 수신된 파일 목록 조회 (인증 필요)
```bash
curl "http://localhost:30301/files/" \
  -H "Authorization: Bearer YOUR_TOKEN"
```

**GET /files/download** - 수신된 파일 다운로드 (인증 필요)
```bash
curl "http://localhost:30301/files/download?path=received/file.zip" \
  -H "Authorization: Bearer YOUR_TOKEN" \
  --output file.zip
```

### EDC Management API

#### 기본 EDC 관리 엔드포인트
```bash
# Asset 목록 조회
curl "http://localhost:30300/api/management/v3/assets" \
  -H "X-Api-Key: SomeOtherApiKey"

# Contract Definition 목록 조회  
curl "http://localhost:30300/api/management/v3/contractdefinitions" \
  -H "X-Api-Key: SomeOtherApiKey"

# Policy 목록 조회
curl "http://localhost:30300/api/management/v3/policydefinitions" \
  -H "X-Api-Key: SomeOtherApiKey"

# Transfer 상태 조회
curl "http://localhost:30300/api/management/v3/transferprocesses" \
  -H "X-Api-Key: SomeOtherApiKey"
```

### 컨테이너 간 통신용 URL

#### Data Source (내부 통신)
```bash
# KHU 백엔드에서 다른 컨테이너로부터 접근할 때
http://khu-backend:8003/files/public/download?path=uploaded/file.zip
http://provider-backend:8003/files/public/download?path=uploaded/file.zip
http://consumer-backend:8003/files/public/download?path=uploaded/file.zip
http://consumer2-backend:8003/files/public/download?path=uploaded/file.zip
```

#### Data Sink (내부 통신)
```bash
# 다른 컨테이너에서 수신할 때
http://khu-backend:8002/public/receive-file
http://provider-backend:8002/public/receive-file
http://consumer-backend:8002/public/receive-file
http://consumer2-backend:8002/public/receive-file
```

### 🔒 보안 및 인증

#### Bearer Token 사용 예시
```bash
# 1. 로그인하여 토큰 획득
TOKEN=$(curl -s -X POST "http://localhost:30302/auth/login" \
  -H "Content-Type: application/json" \
  -d '{"username": "admin", "password": "ymatics@2024"}' \
  | jq -r '.token')

# 2. 획득한 토큰으로 API 호출
curl "http://localhost:30302/files/" \
  -H "Authorization: Bearer $TOKEN"
```

#### API Key 사용 (EDC Management API)
```bash
# EDC Management API는 X-Api-Key 헤더 사용
curl "http://localhost:30300/api/management/v3/assets" \
  -H "X-Api-Key: SomeOtherApiKey" \
  -H "Content-Type: application/json"
```

### 📊 상태 확인 및 헬스체크

#### 각 서비스 상태 확인
```bash
# 백엔드 서비스 상태 확인
curl "http://localhost:30302/health" 2>/dev/null || echo "Service not available"
curl "http://localhost:30301/health" 2>/dev/null || echo "Service not available"

# EDC 커넥터 상태 확인
curl "http://localhost:30300/api/check/health" \
  -H "X-Api-Key: SomeOtherApiKey"
```

### 🚨 에러 응답 코드

| 상태 코드 | 설명 | 주요 원인 |
|----------|------|----------|
| **200** | 성공 | 정상 처리 |
| **400** | 잘못된 요청 | 파라미터 오류, 빈 파일 등 |
| **401** | 인증 실패 | 토큰 없음, 만료된 토큰 |
| **403** | 접근 금지 | 권한 없음, 허용되지 않은 경로 |
| **404** | 리소스 없음 | 파일 없음, 잘못된 경로 |
| **413** | 파일 너무 큼 | 파일 크기 제한 초과 |
| **500** | 서버 오류 | 내부 서버 오류 |

### 📝 API 사용 예제

#### 완전한 파일 전송 워크플로우
```bash
# 1. KHU에서 파일 업로드 (Web UI 또는 API)
curl -X POST "http://localhost:30302/files/" \
  -H "Authorization: Bearer $KHU_TOKEN" \
  -F "file=@motion_data.zip" \
  -F "dir=uploaded"

# 2. Consumer가 파일 다운로드 요청 (EDC를 통해)
# EDC UI에서 Transfer 설정:
# Source: http://khu-backend:8003/files/public/download?path=uploaded/motion_data.zip
# Destination: http://consumer-backend:8002/public/receive-file

# 3. 전송 상태 확인
curl "http://localhost:30000/api/management/v3/transferprocesses" \
  -H "X-Api-Key: SomeOtherApiKey"

# 4. Consumer에서 수신된 파일 확인
curl "http://localhost:30001/files/" \
  -H "Authorization: Bearer $CONSUMER_TOKEN"
```

---

## 🔧 고급 설정

### API 직접 사용

#### Public Download API (인증 불필요)
```bash
# 파일 다운로드
curl "http://localhost:30302/files/public/download?path=uploaded/Motion_gyojeon.zip" \
  --output Motion_gyojeon.zip
```

#### Public Upload API (인증 불필요)
```bash
# 파일 업로드
curl -X POST "http://localhost:30301/public/receive-file" \
  -H "Content-Type: application/zip" \
  -H "Content-Disposition: filename=test_file.zip" \
  --data-binary @test_file.zip
```

### Docker 컨테이너 간 통신

#### 올바른 URL 형식
| 구분 | 형식 | 예시 |
|------|------|------|
| **외부 접근** | `localhost:포트` | `http://localhost:30302/files/download` |
| **컨테이너 간** | `서비스명:내부포트` | `http://khu-backend:8003/files/download` |

#### 서비스명 매핑
- `khu-backend`: KHU 백엔드 서비스
- `consumer-backend`: Ymatics 백엔드 서비스
- `provider-backend`: KOTI 백엔드 서비스
- `consumer2-backend`: KALDA 백엔드 서비스

---

## 🛠️ 문제 해결

### 일반적인 문제

#### 1. 연결 거부 오류 (Connection Refused)
**증상**: `ERR_CONNECTION_REFUSED`
**원인**: IP 주소 또는 포트 설정 문제
**해결**:
```bash
# 환경변수 확인
cat .env

# 컨테이너 상태 확인
docker ps

# 네트워크 연결 테스트
curl http://localhost:30300/health
```

#### 2. 인증 오류 (Authentication Failed)
**증상**: `401 Unauthorized`
**해결**:
- Public API 사용: `/public/` 경로 사용
- 기존 API 사용: Bearer 토큰 확인

#### 3. 파일 전송 실패
**증상**: Transfer 상태가 ERROR
**해결**:
```bash
# Docker 서비스명 사용 확인
# ❌ 잘못된 예: http://localhost:30001/receive-file
# ✅ 올바른 예: http://consumer-backend:8002/public/receive-file
```

### 로그 확인 방법
```bash
# 개발 환경 전체 시스템 로그
docker compose -p edc-dev logs -f

# 운영 환경 전체 시스템 로그
docker compose -p edc-prod logs -f

# 특정 서비스 로그 (프로젝트명 포함)
docker compose -p edc-dev logs -f khu-connector
docker compose -p edc-dev logs -f consumer-backend

# 최근 100줄 로그만 확인
docker compose -p edc-dev logs --tail 100 khu-backend
```

### 시스템 재시작
```bash
# 개발 환경 전체 재시작
docker compose -p edc-dev restart

# 운영 환경 전체 재시작
docker compose -p edc-prod restart

# 특정 서비스만 재시작
docker compose -p edc-dev restart khu-backend
docker compose -p edc-prod restart khu-backend

# 강제 재빌드
docker compose -p edc-dev -f docker-compose.dev.yaml up --build -d
docker compose -p edc-prod -f docker-compose.prod.yaml up --build -d
```

---

# 개별 서비스 헬스체크
curl http://localhost:30300/api/health
```

---

## 🎯 퀵 스타트 체크리스트

- [ ] Docker 및 Docker Compose 설치 확인
- [ ] `.env` 파일 설정 확인 (`SERVER_IP=localhost`)
- [ ] 개발 환경 시작: `docker compose -p edc-dev -f docker-compose.dev.yaml --env-file .env up -d`
- [ ] 컨테이너 상태 확인: `docker compose -p edc-dev ps`
- [ ] 웹 브라우저에서 접속 확인: http://localhost:30300
- [ ] 기본 계정으로 로그인: `khuadmin`/`ymatics@2024`
- [ ] 데이터 파일 업로드 테스트
- [ ] 다른 기관과 데이터 공유 테스트