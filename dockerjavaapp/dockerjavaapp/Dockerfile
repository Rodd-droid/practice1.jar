# We use a Java base image to compile and run Spring Boot
FROM openjdk:17-jdk-slim

# We set the working directory in the container
WORKDIR /app

# We copy the generated .jar file to the image
COPY target/dockerjavaapp-0.0.1-SNAPSHOT.jar app.jar

# We expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]