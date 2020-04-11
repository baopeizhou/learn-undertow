FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/${JAR_FILE} app.jar
RUN apk add -U tzdata \
    && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

ENTRYPOINT exec java -jar /app.jar