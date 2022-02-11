package com.example.trcombeyzashopping.controller;

import com.example.trcombeyzashopping.dto.OrderDto;
import com.example.trcombeyzashopping.dto.dtoConverter.OrderConverter;
import com.example.trcombeyzashopping.model.Order;
import com.example.trcombeyzashopping.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping( "/order")
public class OrderController {

    private final OrderService orderService;
    private final OrderConverter orderConverter;

    @PostMapping( "/add")
    private ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDto orderDto){
        return ResponseEntity.ok(orderConverter.convertToDto(orderService.addOrder(orderConverter.convertToEntity(orderDto))));
    }

    @GetMapping( "/{userId}/orders")
    private ResponseEntity<List<Order>> getAllOrdersByUser(@PathVariable Long userId){
        System.out.println(userId);
        return ResponseEntity.ok(orderService.findOrdersUser(userId));
    }

    @GetMapping("/getall")
    private ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAll());
    }

    @DeleteMapping("/del/{delId}")
    private void delOrderById(@PathVariable Long delId){
        orderService.delOrder(delId);
    }

}
