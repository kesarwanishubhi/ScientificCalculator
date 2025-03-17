# Use the official OpenJDK base image
#FROM openjdk:17-jdk-slim
#
## Set the working directory inside the container
#WORKDIR /app
#
## Copy the JAR file from the target directory into the container
#COPY target/ScientificCalculator-0.0.1-SNAPSHOT.jar app.jar


## Expose port 8080 to the host machine
#EXPOSE 8080
#
## Run the application
#ENTRYPOINT ["java", "-jar", "app.jar"]


FROM ubuntu:latest

RUN apt-get update && \
    apt-get install -y openjdk-17-jdk

RUN mkdir /app
WORKDIR /app
# Copy the JAR file from the target directory into the container
COPY target/ScientificCalculator-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]