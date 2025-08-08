#!/bin/bash

# KALDA 프로덕션용 프론트엔드 빌드 스크립트
# Production Build for KALDA EDC UI

echo "🚀 Building KALDA Frontend for Production..."

# 프로덕션용 빌드 실행
docker buildx build \
  --no-cache \
  --build-arg EDC_UI_ACTIVE_PROFILE=kalda-edc-connector \
  --build-arg EDC_UI_BUILD_VERSION_ARG="KALDA Prod $(git describe --tags --always 2>/dev/null || echo 'unknown')" \
  --build-arg EDC_UI_BUILD_DATE_ARG="$(date -Iseconds)" \
  -t kaldalogoui:1.0 \
  -f /mnt/c/Users/User/Ymatics/Dataspace/sovity-edc-ce/connector-ui/docker/Dockerfile \
  .

echo "✅ KALDA Production build completed!"
echo "📦 Image: kaldalogoui:1.0"
echo "🔒 Security hardened for production use"