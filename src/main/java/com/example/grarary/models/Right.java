package com.example.grarary.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "rights")
public class Right {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "domain_code")
    private String domainCode;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
