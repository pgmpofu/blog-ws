FROM openjdk:8-jdk-alpine as build
WORKDIR /workspace/app
EXPOSE 8888

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:8-jdk-alpine
RUN addgroup -S eablog && adduser -S eablog -G eablog
USER eablog:eablog
ARG JAR_FILE=target/depenency/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
