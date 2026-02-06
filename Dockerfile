# Step 1: Use a lightweight Java 17 runtime as the base
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the JAR file from your target folder into the container
# We rename it to 'app.jar' for simplicity
COPY target/Zdocker-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Tell Docker which port the app runs on
EXPOSE 8080

# Step 5: Command to run the JAR when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]