#!/bin/bash

# KOTI 개발용 프론트엔드 빌드 스크립트
# Development Build for KOTI EDC UI

echo "🔨 Building KOTI Frontend for Development..."

# 개발용 빌드 실행
docker buildx build \
  --build-arg EDC_UI_ACTIVE_PROFILE=koti-edc-connector \
  --build-arg EDC_UI_BUILD_VERSION_ARG="KOTI Dev Build $(date +%Y%m%d-%H%M%S)" \
  --build-arg EDC_UI_BUILD_DATE_ARG="$(date -Iseconds)" \
  -t kotilogoui:dev \
  -f /mnt/c/Users/User/Ymatics/Dataspace/sovity-edc-ce/connector-ui/docker/Dockerfile \
  .

echo "✅ KOTI Development build completed!"
echo "📦 Image: kotilogoui:dev"