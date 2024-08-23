package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="product_reviews")
public class ProductReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(nullable = false)
    private Integer rating;
    private String comment;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name ="review_date",nullable = false)
    private Date reviewDate;
}
