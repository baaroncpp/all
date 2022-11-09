FROM openjdk:11
EXPOSE 8081
ADD build/libs/all-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]