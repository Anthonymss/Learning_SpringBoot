package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name ="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date",nullable = false)
    private Date orderDate;
    @Column(name = "total_amount",nullable = false)
    private Double totalAmount;
    @Column(nullable = false)
    private String status;
}
