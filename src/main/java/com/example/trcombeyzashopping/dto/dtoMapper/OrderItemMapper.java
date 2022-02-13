package com.example.trcombeyzashopping.dto.dtoMapper;

import com.example.trcombeyzashopping.dto.OrderItemDto;
import com.example.trcombeyzashopping.model.OrderItem;
import org.springframework.stereotype.Component;

@Component
public class OrderItemMapper {

    public OrderItem convertToOrder(OrderItemDto orderItemDto){
        return OrderItem.builder()
                .amount(orderItemDto.getAmount())
                .order(orderItemDto.getOrder())
                .product(orderItemDto.getProduct())
                .build();
    }

    public OrderItemDto convertToOrderDto(OrderItem orderItem){
        return OrderItemDto.builder()
                .amount(orderItem.getAmount())
                .order(orderItem.getOrder())
                .product(orderItem.getProduct())
                .build();
    }
}
