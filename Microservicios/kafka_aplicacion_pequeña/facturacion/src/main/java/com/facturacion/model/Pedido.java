package com.facturacion.model;

public class Pedido {
    private String id;
    private String cliente;
    private String detalle;
    private String estado;

    public Pedido(String id, String cliente, String detalle, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.detalle = detalle;
        this.estado = estado;

    }

    public Pedido(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
