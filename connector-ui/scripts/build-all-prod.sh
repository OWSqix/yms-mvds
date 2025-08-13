#!/bin/bash

# 모든 프로필의 프로덕션용 프론트엔드 통합 빌드 스크립트
# Production Build for All EDC UI Profiles

echo "🚀 Building All Frontend Profiles for Production..."
echo "=================================================="

# 스크립트 실행 디렉토리 확인
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(dirname "$SCRIPT_DIR")"

cd "$PROJECT_DIR" || exit 1

# 각 프로필별 개별 Angular 빌드 및 Docker 이미지 빌드
echo "🐳 Building each service with individual base-href..."
echo ""

# YMS 프로덕션 빌드 (base-href: /ymatics/)
echo "🔨 Building YMS with base-href /ymatics/..."
./scripts/build-yms-front-prod.sh
if [ $? -ne 0 ]; then
    echo "❌ YMS build failed!"
    exit 1
fi
echo "✅ YMS build completed!"
echo ""

# KOTI 프로덕션 빌드 (base-href: /koti/)
echo "🔨 Building KOTI with base-href /koti/..."
./scripts/build-koti-front-prod.sh
if [ $? -ne 0 ]; then
    echo "❌ KOTI build failed!"
    exit 1
fi
echo "✅ KOTI build completed!"
echo ""

# KALDA 프로덕션 빌드 (base-href: /kalda/)
echo "🔨 Building KALDA with base-href /kalda/..."
./scripts/build-kalda-front-prod.sh
if [ $? -ne 0 ]; then
    echo "❌ KALDA build failed!"
    exit 1
fi
echo "✅ KALDA build completed!"
echo ""

# KHU 프로덕션 빌드 (base-href: /khu/)
echo "🔨 Building KHU with base-href /khu/..."
./scripts/build-khu-front-prod.sh
if [ $? -ne 0 ]; then
    echo "❌ KHU build failed!"
    exit 1
fi
echo "✅ KHU build completed!"
echo ""

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
echo ""
echo "🎆 Ready for deployment with proper base-href settings!"
echo "   - Each service built with correct routing path"
echo "   - Assets will load from proper subdirectories"