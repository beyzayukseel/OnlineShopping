package com.example.trcombeyzashopping.controller;

import com.example.trcombeyzashopping.dto.OrderDto;
import com.example.trcombeyzashopping.dto.dtoMapper.OrderMapper;
import com.example.trcombeyzashopping.model.Order;
import com.example.trcombeyzashopping.service.OrderService;
import lombok.RequiredArgsConstructor;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;


    @PostMapping("/add")
    private ResponseEntity<Order> saveOrder(@RequestBody OrderDto orderDto) {
        //System.out.println(orderDto.getDate());
        return ResponseEntity.ok(orderService.addOrder(orderMapper.convertToEntity(orderDto)));
    }

    @GetMapping("/{userId}/orders")
    private ResponseEntity<List<Order>> getAllOrdersByUser(@Valid @PathVariable Long userId) throws ChangeSetPersister.NotFoundException {
        System.out.println(userId);
        return ResponseEntity.ok(orderService.findOrdersUser(userId));
    }

    @GetMapping("/getall")
    private ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAll());
    }

    @DeleteMapping("/del/{delId}")
    private void delOrderById(@PathVariable Long delId) {
        orderService.delOrder(delId);
    }

}
