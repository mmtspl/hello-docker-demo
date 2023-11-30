FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD target/hello-docker-demo.jar hello-docker-demo.jar

ENTRYPOINT ["java", "-jar","hello-docker-demo.jar"]