FROM openjdk:11-jdk

LABEL maintainer="swheo@gmail.com"

ARG JAR_FILE=./build/libs/tos-wp-api-0.0.1-snapshot.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]



