FROM openjdk:21-slim
LABEL org.opencontainers.image.source="https://github.com/nancho313/video-loader-config"
LABEL org.opencontainers.image.description="Config server that resolves all the environment configuration within microservices."
COPY target/video*.jar app.jar
CMD ["java", "-jar", "/app.jar"]