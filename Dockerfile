# Stage 1
FROM maven:3.8.7-amazoncorretto-8 as maven_builder
LABEL Alessandra Santomassimo <alessandra.santomassimo@atos.net>
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY --from=maven_builder /app/target/DemoGC-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]