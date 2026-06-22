package com.sprinbootcode.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;


@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    @OneToOne
    private User user;
}
