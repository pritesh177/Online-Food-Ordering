package com.morc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
