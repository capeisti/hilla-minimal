# A minimal Hilla application with Spring Boot and React

Project layout contains only 3 necessary files:
- pom.xml (with minimal deps)
- frontend/index.ts (React entrypoint)
- src/main/java/org/samuliwritescode/Application.java (Server backend)

Everything else will be either generated or are not strictly required. Dockerfile is provided for convenience.

What application does, it executes endpoint call to server which returns string "Hello world" and shows that at frontend.

## To run it
`mvn spring-boot:run`
or
`docker build -t hilla-minimal .` and then 
`docker run -p 8080:8080 hilla-minimal:latest`