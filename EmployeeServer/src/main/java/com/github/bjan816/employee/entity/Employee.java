package com.github.bjan816.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // tell spring boot that this is a JPA entity
@Data // to get the boilerplate code
public class Employee {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment id
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String department;
}