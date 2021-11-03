FROM openjdk:17-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=maven/target/*.jar
COPY ${JAR_FILE} app.jar
RUN java -version
ENTRYPOINT ["java","-jar","/app.jar"]

