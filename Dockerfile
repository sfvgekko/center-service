FROM openjdk:11.0.10-slim
COPY "./target/center-service-0.0.1.jar" "app.jar"
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]