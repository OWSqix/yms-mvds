#!/bin/bash

# 모든 프로필의 프로덕션용 프론트엔드 통합 빌드 스크립트
# Production Build for All EDC UI Profiles

echo "🚀 Building All Frontend Profiles for Production..."
echo "=================================================="

# 스크립트 실행 디렉토리 확인
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(dirname "$SCRIPT_DIR")"

cd "$PROJECT_DIR" || exit 1

# 프로덕션용 Angular 빌드 실행
echo "📦 Running Angular production build..."
npm run build-prod

if [ $? -ne 0 ]; then
    echo "❌ Angular build failed!"
    exit 1
fi

# 각 프로필별 프로덕션용 Docker 이미지 빌드
echo ""
echo "🐳 Building Docker images for production..."

# YMS 프로덕션 빌드
echo "Building YMS production image..."
./scripts/build-yms-front-prod.sh

# KOTI 프로덕션 빌드
echo "Building KOTI production image..."
./scripts/build-koti-front-prod.sh

# KALDA 프로덕션 빌드
echo "Building KALDA production image..."
./scripts/build-kalda-front-prod.sh

# KHU 프로덕션 빌드
echo "Building KHU production image..."
./scripts/build-khu-front-prod.sh

echo ""
echo "✅ All production builds completed!"
echo "=================================================="
echo "📦 Created images:"
echo "  - ymslogoui:1.0"
echo "  - kotilogoui:1.0"
echo "  - kaldalogoui:1.0"
echo "  - khulogoui:1.0"
echo ""
echo "🔒 Security hardened for production deployment!"