FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/spring-manipulator-api.jar spring-manipulator-api.jar
ENTRYPOINT ["java","-jar","/spring-manipulator-api.jar"]