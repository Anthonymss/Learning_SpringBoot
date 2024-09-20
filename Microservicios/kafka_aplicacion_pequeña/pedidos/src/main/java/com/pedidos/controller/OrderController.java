package com.pedidos.controller;


import com.pedidos.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class OrderController {

    @Autowired
    private KafkaTemplate<String, Pedido> kafkaTemplate;

    private static final String TOPIC = "pedido_topic";

    @PostMapping("/crear")
    public String crearPedido(@RequestBody Pedido pedido) {
        kafkaTemplate.send(TOPIC, pedido);
        return "Pedido enviado a Kafka";
    }
}