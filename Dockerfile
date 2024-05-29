# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
COPY target/jb-hello-world-maven-0.2.0.jar my-app.jar

# Expose the port your application runs on (adjust if necessary)
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "my-app.jar"]
