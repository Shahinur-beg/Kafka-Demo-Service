FROM openjdk:17
VOLUME /tmp/logs
COPY target/kafka-producer.jar /app/kafka-producer.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/kafka-producer.jar"]