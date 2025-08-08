#!/bin/bash

# KALDA 개발용 프론트엔드 빌드 스크립트
# Development Build for KALDA EDC UI

echo "🔨 Building KALDA Frontend for Development..."

# 개발용 빌드 실행
docker buildx build \
  --build-arg EDC_UI_ACTIVE_PROFILE=kalda-edc-connector \
  --build-arg EDC_UI_BUILD_VERSION_ARG="KALDA Dev Build $(date +%Y%m%d-%H%M%S)" \
  --build-arg EDC_UI_BUILD_DATE_ARG="$(date -Iseconds)" \
  -t kaldalogoui:dev \
  -f /mnt/c/Users/User/Ymatics/Dataspace/sovity-edc-ce/connector-ui/docker/Dockerfile \
  .

echo "✅ KALDA Development build completed!"
echo "📦 Image: kaldalogoui:dev"