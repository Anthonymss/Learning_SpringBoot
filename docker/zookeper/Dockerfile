# Usa la imagen oficial de Zookeeper
FROM zookeeper:3.8.0

# Establecer variables de entorno
ENV ZOO_MY_ID=1
ENV ZOO_SERVERS=server.1=zookeeper:2888:3888

# Copiar archivos de configuración personalizados (si los tienes)
# COPY zoo.cfg /conf/zoo.cfg

# Configuración opcional
# Puedes descomentar y personalizar las siguientes líneas según tus necesidades
# ENV ZOO_DATA_DIR=/data
# ENV ZOO_DATALOG_DIR=/datalog

# Crear directorios para almacenamiento persistente
RUN mkdir -p /data /datalog

# Exponer el puerto Zookeeper
EXPOSE 2181 2888 3888

# Comando para iniciar Zookeeper
CMD ["zkServer.sh", "start-foreground"]
