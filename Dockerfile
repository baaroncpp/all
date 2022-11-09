FROM openjdk:11-jdk-alpine
EXPOSE 8081
ADD build/libs/*jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]