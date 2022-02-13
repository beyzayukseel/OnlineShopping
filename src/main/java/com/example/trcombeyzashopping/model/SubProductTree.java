package com.example.trcombeyzashopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class SubProductTree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer amount;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name =  "product_id")
    private Product product;
}
