FROM openjdk:17
VOLUME /tmp/logs
COPY target/kafka-consumer.jar /app/kafka-consumer.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/kafka-consumer.jar"]