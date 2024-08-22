package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "loans")/*prestamo*/
public class Loans {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "books_id",nullable = false)
    private Books  books;

    @ManyToOne
    @JoinColumn(name="members_id",nullable = false)
    private Members members;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="loan_date",nullable = false)
    private Date loanDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="return_date",nullable = true)
    private Date returnDate;
}
