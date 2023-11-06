package com.SebastianContreras.provider.SpringBootProvider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {
@Bean
    public NewTopic generateTopic(){
    Map<String,String> configurations = new HashMap<>();
    configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG,TopicConfig.CLEANUP_POLICY_DELETE); //delete(borra mensaje), compact (mantiene el mas actualizado)
    configurations.put(TopicConfig.RETENTION_MS_CONFIG,"86400000"); //Tiemppo de retencion de mensajes defecto -1 no se borran nunca
    configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG,"1073741824"); //Tamaño maximo de cada segmento (1 GB)
    configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG,"1000012"); //Tamaño maximo de mensajes

        return TopicBuilder.name("Sebastian-Contreras-Topic")
                .partitions(2)
                .replicas(2)
                .configs(configurations)
                .build();
    }
}
