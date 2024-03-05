FROM maven:latest

# Set the working directory
WORKDIR /app

# Copy pom.xml to the container

COPY pom.xml /app/

# Copy the entire project
COPY . /app/

#Package the application
RUN mvn package

# Run the main class
CMD ["java", "-jar", "target/interconversions.jar"]

