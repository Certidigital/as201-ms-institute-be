FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/as201-ms-institute-0.0.1-SNAPSHOT.jar app.jar
ENV DB_URL ${DB_URL}
ENV DB_USER ${DB_USER}
ENV DB_PASSWORD ${DB_PASSWORD}
EXPOSE 8083
ENTRYPOINT ["java", "-Duser.timezone=GMT-5", "-jar", "app.jar"]