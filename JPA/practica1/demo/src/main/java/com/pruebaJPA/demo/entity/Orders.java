package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

    @Temporal(TemporalType.TIMESTAMP)
    private Date order_date;
    private Double total_amount;
}
