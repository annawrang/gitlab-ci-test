FROM maven:3.6.0-jdk-11-slim as builder
COPY . .
RUN mvn clean package

FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR application
ARG JAR_FILE=target/*.jar
COPY --from=builder ${JAR_FILE} app.jar
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]