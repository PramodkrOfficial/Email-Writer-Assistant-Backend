FROM openjdk:17-jdk

COPY target/email-writer-0.0.1-SNAPSHOT.jar app/email-writer-0.0.1-SNAPSHOT.jar

EXPOSE 8080:8080

ENTRYPOINT ["java", "-jar", "app/email-writer-0.0.1-SNAPSHOT.jar"]