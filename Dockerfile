FROM node:lts-alpine
WORKDIR /build
COPY ui .
RUN npm install
RUN npm run build

FROM nginx:latest
COPY ./docker/default.conf /etc/nginx/conf.d
COPY --from=0 /build/dist /opt/numgen/ui
