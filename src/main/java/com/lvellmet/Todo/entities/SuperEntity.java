package com.lvellmet.Todo.entities;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;
}
