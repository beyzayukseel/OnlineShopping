package com.example.trcombeyzashopping.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@RequiredArgsConstructor
@Setter
@Getter
@Entity
public class SubProductTree {

    @EmbeddedId
    private SubProductId subProductId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @MapsId("id")
    private Product product;

    private Integer amount;

}
