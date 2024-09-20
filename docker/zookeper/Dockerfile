# Usa la imagen oficial de Zookeeper
FROM zookeeper:3.8.0

# Establecer variables de entorno
ENV ZOO_MY_ID=1
ENV ZOO_SERVERS=server.1=zookeeper:2888:3888

# Crear directorios para almacenamiento persistente
RUN mkdir -p /data /datalog

# Exponer los puertos de Zookeeper
EXPOSE 2181 2888 3888

# Comando para iniciar Zookeeper
CMD ["zkServer.sh", "start-foreground"]
