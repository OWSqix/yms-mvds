#!/bin/bash

# 모든 프로필의 개발용 프론트엔드 통합 빌드 스크립트
# Development Build for All EDC UI Profiles

echo "🔨 Building All Frontend Profiles for Development..."
echo "=================================================="

# 스크립트 실행 디렉토리 확인
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(dirname "$SCRIPT_DIR")"

cd "$PROJECT_DIR" || exit 1

# 개발용 Angular 빌드 실행
echo "📦 Running Angular development build..."
npm run build-dev

if [ $? -ne 0 ]; then
    echo "❌ Angular build failed!"
    exit 1
fi

# 각 프로필별 개발용 Docker 이미지 빌드
echo ""
echo "🐳 Building Docker images for development..."

# YMS 개발 빌드
echo "Building YMS development image..."
./scripts/build-yms-front-dev.sh

# KOTI 개발 빌드
echo "Building KOTI development image..."
./scripts/build-koti-front-dev.sh

# KALDA 개발 빌드
echo "Building KALDA development image..."
./scripts/build-kalda-front-dev.sh

# KHU 개발 빌드
echo "Building KHU development image..."
./scripts/build-khu-front-dev.sh

echo ""
echo "✅ All development builds completed!"
echo "=================================================="
echo "📦 Created images:"
echo "  - ymslogoui:dev"
echo "  - kotilogoui:dev"
echo "  - kaldalogoui:dev"
echo "  - khulogoui:dev"
echo ""
echo "🚀 Ready for development testing!"