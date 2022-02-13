package com.example.trcombeyzashopping.dto.dtoMapper;

import com.example.trcombeyzashopping.dto.OrderDto;
import com.example.trcombeyzashopping.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public OrderDto convertToDto(Order order){
        return OrderDto.builder()
                .date(order.getDate())
                .deadline(order.getDeadline())
                .user(order.getUser())
                .build();
    }

    public Order convertToEntity (OrderDto orderDto){
        return Order.builder()
                .date(orderDto.getDate())
                .deadline(orderDto.getDeadline())
                .user(orderDto.getUser())
                .build();
    }


}
