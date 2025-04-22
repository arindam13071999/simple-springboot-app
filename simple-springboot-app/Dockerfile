    FROM openjdk:17-jdk-slim
    VOLUME /tmp
    ARG JAR_FILE=target/*.jar
    COPY ${JAR_FILE} app.jar
    ENTRYPOINT ["java","-jar","simple-springboot-app/app.jar"]
