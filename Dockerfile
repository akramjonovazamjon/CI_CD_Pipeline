FROM openjdk:17
ADD target/ci-cd.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080