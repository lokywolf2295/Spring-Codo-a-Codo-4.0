package com.codoacodo.project8.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="personas")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 20)
    private long id;
    @Column(name = "name", nullable = false, length = 15)
    private String name;
    @Column(name = "lastName", length = 15)
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "dni", length = 10)
    private String dni;

   /* @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = "");*/
}