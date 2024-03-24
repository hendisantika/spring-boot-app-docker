FROM openjdk:23-slim
LABEL authors="hendisantika"
WORKDIR /app
COPY target/spring-boot-app-docker-1.0.0.jar .
EXPOSE 8081
ENTRYPOINT ["java","-jar","spring-boot-app-docker-1.0.0.jar"]
