# Use a JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy and build the application
COPY . .

# Build the project (assuming you're using Maven Wrapper)
RUN ./mvnw clean package -DskipTests

# Expose the default Spring Boot port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/carsfinder-0.0.1-SNAPSHOT.jar"]
