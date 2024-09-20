package com.facturacion.service;

import com.facturacion.model.Pedido;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    @KafkaListener(topics = "pedido_topic", groupId = "facturacion_group")
    public void generarFactura(Pedido pedido) {
        System.out.println("Generando factura para el pedido: " + pedido.getDetalle());
        pedido.setEstado("Facturado");
    }
}