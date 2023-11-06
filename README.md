// INICIAL ZOOKEPER
$ bin/zookeeper-server-start.sh config/zookeeper.properties

// INICIAR KAFKA
$ bin/kafka-server-start.sh config/server.properties

// CREAR UN NUEVO TOPIC EN EL SERVIDOR KAFKA
$ bin/kafka-topics.sh --create --topic {NUEVOTOPIC} --bootstrap-server localhost:9092

// DESCRIBIR LOS DETALLES DE UN TOPIC
$ bin/kafka-topics.sh --describe --topic {NUEVOTOPIC} --bootstrap-server localhost:9092

// LISTAR TODOS LOS TOPICS QUE EXISTEN DENTRO DEL BROKER
$ bin/kafka-topics.sh --list --bootstrap-server localhost:9092


// INICIA UNA CONSOLA PARA VER MENSAJES DE UN TOPIC ESPECIFICO
$ bin/kafka-console-consumer.sh --topic {NUEVOTOPIC} --bootstrap-server localhost:9092


// INICIA UNA CONSOLA PARA ENVIAR MENSAJES A UN TOPIC ESPECIFICO
$ bin/kafka-console-producer.sh --topic {NUEVOTOPIC} --broker-list localhost:9092