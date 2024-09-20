package com.cocina.service;

import com.cocina.model.Pedido;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KitchenService {

    @KafkaListener(topics = "pedido_topic", groupId = "cocina_group")
    public void procesarPedido(Pedido pedido) {
        System.out.println("Pedido recibido en cocina: " + pedido.getDetalle());
        pedido.setEstado("En cocina");
    }
}