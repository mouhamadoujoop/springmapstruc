FROM openjdk:17-jdk-slim

LABEL maintainer="Modou Diop mouhamadoujoop@gmail.com"

EXPOSE 8080

ADD target/mapstruct-0.0.1-SNAPSHOT.jar mapstruct.jar

ENTRYPOINT ["java", "-jar", "mapstruct.jar"]
