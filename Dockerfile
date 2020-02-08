FROM openjdk:8-jdk-alpine
RUN addgroup -S eablog && adduser -S eablog -G eablog
USER eablog:eablog
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
