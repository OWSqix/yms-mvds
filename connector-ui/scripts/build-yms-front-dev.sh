#!/bin/bash

# YMS 개발용 프론트엔드 빌드 스크립트
# Development Build for Ymatics EDC UI

echo "🔨 Building YMS Frontend for Development..."

# 개발용 빌드 실행
docker buildx build \
  --build-arg EDC_UI_ACTIVE_PROFILE=ymatics-edc-connector \
  --build-arg EDC_UI_BUILD_VERSION_ARG="YMS Dev Build $(date +%Y%m%d-%H%M%S)" \
  --build-arg EDC_UI_BUILD_DATE_ARG="$(date -Iseconds)" \
  -t ymslogoui:dev \
  -f /mnt/c/Users/User/Ymatics/Dataspace/sovity-edc-ce/connector-ui/docker/Dockerfile \
  .

echo "✅ YMS Development build completed!"
echo "📦 Image: ymslogoui:dev"