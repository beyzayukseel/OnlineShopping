package com.example.trcombeyzashopping.dto;


import com.example.trcombeyzashopping.model.Order;
import com.example.trcombeyzashopping.model.Product;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Builder
@Setter
@Getter
@Data
public class OrderItemDto {

    private Integer amount;

    private Product product;

    private Order order;
}
