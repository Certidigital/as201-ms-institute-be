FROM alpine
RUN apk update \
	&& apk add openjdk11-jre
COPY target/as201-ms-institute-0.0.1-SNAPSHOT.jar ms-institute.jar
CMD ["java","-jar","ms-institute.jar"]
EXPOSE 8083