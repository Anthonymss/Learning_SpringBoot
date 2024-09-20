# Usa la imagen oficial de Kafka
FROM wurstmeister/kafka:latest

# Establecer variables de entorno
ENV KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://kafka:9092
ENV KAFKA_LISTENERS=PLAINTEXT://0.0.0.0:9092
ENV KAFKA_ZOOKEEPER_CONNECT=zookeeper-o4w6.onrender.com:45643
ENV KAFKA_BROKER_ID=1

# Exponer el puerto de Kafka
EXPOSE 9092

# Comando para iniciar Kafka
CMD ["kafka-server-start.sh", "/opt/kafka/config/server.properties"]
