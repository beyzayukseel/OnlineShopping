package com.example.trcombeyzashopping.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Operation {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String operationName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name =  "product_id")
    private Product product;
}

