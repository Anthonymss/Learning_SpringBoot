package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String description;
    @Column(nullable = false)
    private Integer credits;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
