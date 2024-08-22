package com.pruebaJPA.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "books")
@Data
public class Books {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String isbn;
    @Column(name="publisher_date")
    private Date publishedDate;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Authors authors;
}
