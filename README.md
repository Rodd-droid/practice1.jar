# practice1.jar

This project is a simple Spring Boot application, containerized using Docker. The application exposes two main routes and is ready to run inside a Docker container.

## Files

- **DockerJavaAppApplication.java**: Contains the main Spring Boot application, which exposes two routes:
  - `/`: Returns a welcome message.
  - `/greet/{name}`: Returns a personalized greeting.
- **Dockerfile**: Defines the Docker environment to run the Spring Boot application.

## File Structure

├── src │ 
        └── main │ 
                 └── java │ 
                          └── com │ 
                                  └── example │ 
                                              └── dockerjavaapp │ 
                                              │                 └── DockerJavaAppApplication.java 
                                              └── Dockerfile


## Instructions to Run the Application

### 1. Build the Spring Boot Application

Before building the Docker image, package the Spring Boot application into a `.jar` file:

```bash
./mvnw clean package
```

This will generate a dockerjavaapp-0.0.1-SNAPSHOT.jar file in the target directory.

### 2. Build the Docker Container

To build the Docker image, run:

```bash
docker build -t java-app .
```

### 3. Run the Container

To start the container, use the following command:

```bash
docker run -p 8080:8080 java-app
```

This will expose the app at http://localhost:8080.

### 4. Test the Application

- Home route: Go to http://localhost:8080/ to get a welcome message.
- Greet route: Go to http://localhost:8080/greet/{name}, replacing {name} with any name you choose, to receive a personalized greeting.

### Dependencies

This application uses Spring Boot, with dependencies managed in the pom.xml file (not shown here). Ensure you have Maven installed to build the project.

### Usage Example

```bash
# Test the home route
curl http://localhost:8080/

# Test the personalized greeting route
curl http://localhost:8080/greet/Rodrigo
```

### Author
Project developed by Rodrigo Quilumba.