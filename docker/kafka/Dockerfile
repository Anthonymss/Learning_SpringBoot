FROM wurstmeister/kafka:latest

# URL de Zookeeper
ENV KAFKA_ZOOKEEPER_CONNECT=zookeeper-o4w6.onrender.com:2181
# Valor temporal para KAFKA_ADVERTISED_LISTENERS
ENV KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092  
# Escuchar en todas las interfaces
ENV KAFKA_LISTENERS=PLAINTEXT://0.0.0.0:9092
ENV KAFKA_LISTENER_SECURITY_PROTOCOL_MAP=PLAINTEXT:PLAINTEXT

# Exponer el puerto de Kafka
EXPOSE 9092

# Comando para iniciar Kafka
CMD ["start-kafka.sh"]
