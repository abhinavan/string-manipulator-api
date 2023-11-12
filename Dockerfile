FROM xenit/openjdk:17-jdk-alpine3.13
EXPOSE 8080
ADD target/spring-manipulator-api.jar spring-manipulator-api.jar
ENTRYPOINT ["java","-jar","/spring-manipulator-api.jar"]