    FROM openjdk:17-jdk-slim
    VOLUME /tmp
    WORKDIR /app
    COPY ./simple-springboot-app/target/*.jar app.jar
    ENTRYPOINT ["java","-jar","app.jar"]
