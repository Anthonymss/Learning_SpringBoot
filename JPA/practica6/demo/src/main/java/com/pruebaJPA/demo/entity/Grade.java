package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "enrollment_id")
    private Enrollment enrollment;
    @Column(nullable = false,length = 100)
    private String grade;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, name = "date_recorded")
    private Date dateRecorded;

}
