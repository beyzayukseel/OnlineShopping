package com.example.trcombeyzashopping.model;

import lombok.*;

import javax.persistence.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private String productType;

    @Enumerated(EnumType.STRING)
    private Salable salable;

    private Integer amount;
}

