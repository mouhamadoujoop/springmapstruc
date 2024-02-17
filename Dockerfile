FROM openjdk:17-jdk-slim

<<<<<<< HEAD
LABEL maintainer="Modou Diop mouhamadoujoop@gmail.com"
=======
LABEL maintainer="Modou DIOP mouhamadoujoop@gmail.com"
>>>>>>> e7d8d3e8ae6cb2e73fa00472767d7eb81a3133d9

EXPOSE 8080

ADD target/mapstruct-0.0.1-SNAPSHOT.jar mapstruct.jar

ENTRYPOINT ["java", "-jar", "mapstruct.jar"]
