package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "medications")
@Data
public class Medication {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String dosage;
    @ManyToOne
    @JoinColumn(name="treatment_id")
    private Treatment treatment;
}
