FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/as201-ms-institute-0.0.1-SNAPSHOT.jar app.jar
ENV DB_URL ${DB_URL}
ENV DB_USERNAME ${DB_USERNAME}
ENV DB_PASSWORD ${DB_PASSWORD}
ENV PROFILE ${PROFILE}
EXPOSE 8083
ENTRYPOINT ["java", "-Dspring.profiles.active=$PROFILE", "-Duser.timezone=GMT-5", "-jar", "app.jar"]