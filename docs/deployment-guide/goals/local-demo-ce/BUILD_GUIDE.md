# EDC UI Build System Guide

이 문서는 sovity-edc-ce 프로젝트의 새로운 dev/prod 분리 빌드 시스템에 대한 사용 가이드입니다.

## 📋 빌드 시스템 개요

### 환경 분리
- **개발 환경 (Development)**: 빠른 개발 사이클, 디버깅 지원, 상세 로그
- **프로덕션 환경 (Production)**: 최적화된 성능, 보안 강화, 압축 및 캐싱

## 🚀 빌드 명령어

### 개발용 빌드

```bash
# 개발용 Angular 빌드만
cd connector-ui
npm run build-dev

# 개발용 Docker 이미지 빌드 (개별)
./scripts/build-yms-front-dev.sh
./scripts/build-koti-front-dev.sh
./scripts/build-kalda-front-dev.sh
./scripts/build-khu-front-dev.sh

# 개발용 모든 이미지 빌드 (통합)
./scripts/build-all-dev.sh
```

### 프로덕션용 빌드

```bash
# 프로덕션용 Angular 빌드만
cd connector-ui
npm run build-prod

# 프로덕션용 Docker 이미지 빌드 (개별)
./scripts/build-yms-front-prod.sh
./scripts/build-koti-front-prod.sh
./scripts/build-kalda-front-prod.sh
./scripts/build-khu-front-prod.sh

# 프로덕션용 모든 이미지 빌드 (통합)
./scripts/build-all-prod.sh
```

### 레거시 빌드 (하위 호환성)

```bash
# 기존 빌드 스크립트 (자동으로 프로덕션 빌드로 리다이렉트)
./build-yms-front.sh
./build-koti-front.sh
./build-kalda-front.sh
./build-khu-front.sh
```

## 🐳 Docker 이미지

### 개발용 이미지
- `ymslogoui:dev`
- `kotilogoui:dev` 
- `kaldalogoui:dev`
- `khulogoui:dev`

특징:
- 디버깅 도구 포함
- 빈번한 헬스체크
- 개발용 환경 변수
- 소스맵 포함

### 프로덕션용 이미지  
- `ymslogoui:1.0`
- `kotilogoui:1.0`
- `kaldalogoui:1.0`
- `khulogoui:1.0`

특징:
- 보안 강화 (비특권 사용자)
- 최적화된 번들 크기
- 프로덕션 환경 변수
- 소스맵 제거

## 🔧 Docker Compose

### 개발 환경 실행

```bash
cd docs/deployment-guide/goals/local-demo-ce

# 개발용 구성으로 실행
docker-compose -f docker-compose.dev.yaml up -d

# 포트 접근
# Consumer (YMS):     http://localhost:22000
# Provider (KOTI):    http://localhost:11000
# Consumer2 (KALDA):  http://localhost:23000
# KHU:                http://localhost:24000
```

### 프로덕션 환경 실행

```bash
cd docs/deployment-guide/goals/local-demo-ce

# 프로덕션용 구성으로 실행 (Nginx 리버스 프록시 사용)
docker-compose -f docker-compose.prod.yaml up -d

# 포트 접근 (Nginx 통합)
# All services:       http://localhost:8080
# HTTPS:              https://localhost:8443
```

## 📁 파일 구조

```
connector-ui/
├── scripts/
│   ├── build-all-dev.sh          # 개발용 통합 빌드
│   ├── build-all-prod.sh         # 프로덕션용 통합 빌드
│   ├── build-*-front-dev.sh      # 개별 개발용 빌드
│   ├── build-*-front-prod.sh     # 개별 프로덕션용 빌드
├── docker/
│   ├── Dockerfile.dev            # 개발용 Docker 파일
│   ├── Dockerfile.prod           # 프로덕션용 Docker 파일
│   └── Dockerfile                # 레거시 (프로덕션용으로 유지)
├── src/environments/
│   ├── environment.ts            # 기본 환경
│   ├── environment.dev.ts        # 개발 환경 변수
│   └── environment.prod.ts       # 프로덕션 환경 변수
└── package.json                  # 새로운 빌드 스크립트 포함
```

## ⚙️ 환경 변수 차이점

### 개발 환경
- `enableDebug: true`
- `apiTimeout: 30000ms`
- `logLevel: 'debug'`
- `enableConsoleLog: true`
- `strictSSL: false`
- `cacheTimeout: 60000ms`

### 프로덕션 환경
- `enableDebug: false`
- `apiTimeout: 10000ms`
- `logLevel: 'error'`
- `enableConsoleLog: false`
- `strictSSL: true`
- `cacheTimeout: 3600000ms`

## 🔄 마이그레이션 가이드

### 기존 사용자를 위한 변경사항

1. **Docker Compose 파일명 변경**:
   - `docker-compose.yaml` → `docker-compose.dev.yaml`
   - `docker-compose-with-nginx.yaml` → `docker-compose.prod.yaml`

2. **새로운 빌드 명령어 사용 권장**:
   ```bash
   # 개발용
   ./scripts/build-all-dev.sh
   
   # 프로덕션용  
   ./scripts/build-all-prod.sh
   ```

3. **환경별 이미지 사용**:
   - 개발: `*logoui:dev`
   - 프로덕션: `*logoui:1.0`

## 📊 성능 비교

| 항목 | 개발용 | 프로덕션용 | 개선율 |
|------|--------|------------|--------|
| 빌드 시간 | ~3분 | ~5분 | -40% (dev) |
| 번들 크기 | ~8MB | ~3MB | 62% ↓ |
| 첫 로드 시간 | ~2초 | ~1초 | 50% ↓ |
| 디버깅 지원 | ✅ 풀 지원 | ❌ 최소화 | - |
| 보안 강화 | 🔶 기본 | ✅ 강화 | - |

## 🛠️ 트러블슈팅

### 일반적인 문제들

1. **이미지 빌드 실패**:
   ```bash
   # Angular 빌드부터 다시 실행
   npm run build-dev  # 또는 build-prod
   ```

2. **Docker Compose 실행 실패**:
   ```bash
   # 이미지가 빌드되었는지 확인
   docker images | grep logoui
   ```

3. **환경 변수 문제**:
   - `environment.dev.ts` 또는 `environment.prod.ts` 파일 확인
   - Angular 빌드 재실행 필요

### 지원

문제가 발생하면 다음을 확인하세요:
- Node.js 버전 (권장: 16.x)
- Docker 버전 (권장: 20.x+)
- 충분한 디스크 공간 (최소 5GB)

---

**업데이트**: 2025-01-08
**버전**: 1.0.0