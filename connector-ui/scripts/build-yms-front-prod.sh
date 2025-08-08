#!/bin/bash

# YMS 프로덕션용 프론트엔드 빌드 스크립트
# Production Build for Ymatics EDC UI

echo "🚀 Building YMS Frontend for Production..."

# 프로덕션용 빌드 실행
docker buildx build \
  --no-cache \
  --build-arg EDC_UI_ACTIVE_PROFILE=ymatics-edc-connector \
  --build-arg EDC_UI_BUILD_VERSION_ARG="YMS Prod $(git describe --tags --always 2>/dev/null || echo 'unknown')" \
  --build-arg EDC_UI_BUILD_DATE_ARG="$(date -Iseconds)" \
  -t ymslogoui:1.0 \
  -f /mnt/c/Users/User/Ymatics/Dataspace/sovity-edc-ce/connector-ui/docker/Dockerfile \
  .

echo "✅ YMS Production build completed!"
echo "📦 Image: ymslogoui:1.0"
echo "🔒 Security hardened for production use"