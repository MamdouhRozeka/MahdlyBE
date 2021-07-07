FROM openjdk:8-jdk-alpine
LABEL maintainer="m.abuelatta1995@gmail.com"
VOLUME /main-app
ADD build/libs/mahdly-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar","/app.jar"]