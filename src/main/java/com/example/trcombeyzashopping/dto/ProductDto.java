package com.example.trcombeyzashopping.dto;

import com.example.trcombeyzashopping.model.Salable;
import lombok.*;

@Builder
@Setter
@Getter
@Data
public class ProductDto {

    private String productName;
    private String productType;
    private Salable salable;
}
