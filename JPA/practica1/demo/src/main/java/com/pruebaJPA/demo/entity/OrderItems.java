package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    private Integer quantity;
    private Double price;

}
