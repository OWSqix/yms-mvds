# ===================================
# Multi-Stage Dockerfile for Frontend
# ===================================

# Stage 1: Development Environment
FROM node:18.19.1 as development

RUN apt-get update && apt-get install -y vim curl

WORKDIR /app

ARG DATA_SOURCE_API_URL
ARG DATA_SINK_API_URL
ARG BASE_HREF=/
ARG DEPLOY_URL=/
ENV DATA_SOURCE_API_URL=$DATA_SOURCE_API_URL
ENV DATA_SINK_API_URL=$DATA_SINK_API_URL
ENV BASE_HREF=$BASE_HREF
ENV DEPLOY_URL=$DEPLOY_URL

# npm 타임아웃 증가 설정
RUN npm config set fetch-timeout 300000 && \
    npm config set fetch-retry-mintimeout 20000 && \
    npm config set fetch-retry-maxtimeout 120000 && \
    npm install -g @angular/cli@19.2.4

COPY package*.json ./
# npm 타임아웃 증가 설정과 함께 install
RUN npm config set fetch-timeout 300000 && \
    npm config set fetch-retry-mintimeout 20000 && \
    npm config set fetch-retry-maxtimeout 120000 && \
    npm install

COPY . .

RUN node set-env.js

EXPOSE 4200

# Development server command
CMD ["sh", "-c", "ng serve --host 0.0.0.0 --disable-host-check --base-href $BASE_HREF --deploy-url $DEPLOY_URL"]

# Stage 2: Build Environment
FROM node:18.19.1 as build

WORKDIR /app

ARG DATA_SOURCE_API_URL
ARG DATA_SINK_API_URL
ARG BASE_HREF=/
ARG DEPLOY_URL=/
ENV DATA_SOURCE_API_URL=$DATA_SOURCE_API_URL
ENV DATA_SINK_API_URL=$DATA_SINK_API_URL
ENV BASE_HREF=$BASE_HREF
ENV DEPLOY_URL=$DEPLOY_URL

# npm 타임아웃 증가 설정
RUN npm config set fetch-timeout 300000 && \
    npm config set fetch-retry-mintimeout 20000 && \
    npm config set fetch-retry-maxtimeout 120000 && \
    npm install -g @angular/cli@19.2.4

COPY package*.json ./
# npm 타임아웃 증가 설정과 함께 install
RUN npm config set fetch-timeout 300000 && \
    npm config set fetch-retry-mintimeout 20000 && \
    npm config set fetch-retry-maxtimeout 120000 && \
    npm install

COPY . .

RUN node set-env.js

# Production build with base-href and deploy-url
RUN ng build --configuration=production --base-href="$BASE_HREF" --deploy-url="$DEPLOY_URL"

# Stage 3: Production Environment (Nginx)
FROM nginx:alpine as production

# Copy built application from build stage (Angular 17+ outputs to browser subfolder)
COPY --from=build /app/dist/frontend/browser /usr/share/nginx/html

# Create custom nginx configuration
RUN echo 'server {\
    listen 4200;\
    server_name localhost;\
    root /usr/share/nginx/html;\
    index index.html;\
    \
    # SPA fallback for client-side routing\
    location / {\
        try_files $uri $uri/ /index.html;\
    }\
    \
    # Security headers\
    add_header X-Frame-Options "SAMEORIGIN" always;\
    add_header X-XSS-Protection "1; mode=block" always;\
    add_header X-Content-Type-Options "nosniff" always;\
    \
    # Compression\
    gzip on;\
    gzip_vary on;\
    gzip_comp_level 6;\
    gzip_types text/plain text/css text/xml text/javascript application/javascript application/xml+rss application/json;\
}' > /etc/nginx/conf.d/default.conf

EXPOSE 4200

CMD ["nginx", "-g", "daemon off;"]
