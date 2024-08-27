package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(nullable = false,unique = true,length = 50)
    private String email;
    @Column(nullable = false,name = "date_of_birth")
    private Date dateOfBirth;
    @Column(nullable = false,name = "enrollment_year")
    private Integer enrollmentYear;

}
