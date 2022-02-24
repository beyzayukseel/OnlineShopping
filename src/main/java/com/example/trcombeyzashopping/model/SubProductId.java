package com.example.trcombeyzashopping.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class SubProductId implements Serializable {
    private Long id;
    private Long subProductId;

}
