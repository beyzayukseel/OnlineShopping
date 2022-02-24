package com.example.trcombeyzashopping.controller;

import com.example.trcombeyzashopping.dto.OrderItemDto;
import com.example.trcombeyzashopping.dto.dtoMapper.OrderItemMapper;
import com.example.trcombeyzashopping.model.OrderItem;
import com.example.trcombeyzashopping.model.Product;
import com.example.trcombeyzashopping.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

    private final OrderItemService orderItemService;
    private final OrderItemMapper orderItemMapper;


    @PostMapping("/add")
    private ResponseEntity<OrderItem> saveOrderItem(@RequestBody OrderItemDto orderItemDto) {
        System.out.println(orderItemDto.getOrder());
        return ResponseEntity.ok(orderItemService.addOrderItem(orderItemMapper.convertToOrder(orderItemDto)));
    }

    @GetMapping("/all")
    private ResponseEntity<List<OrderItem>> getAllOrderItems() {
        return ResponseEntity.ok(orderItemService.allOrderItems());
    }

    @GetMapping("/{orderId}/all")
    private ResponseEntity<List<OrderItem>> getOrdersItems(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderItemService.getOrderItems(orderId));
    }

    @DeleteMapping("/del/{delId}")
    private void delOrderItem(@PathVariable Long delId) {

          orderItemService.delOrderItem(delId);
          //throw new EmptyResultDataAccessException(1);
    }

    @GetMapping( "/product/{orderItemId}")
    private Long getOrderItemProductId(@PathVariable Long orderItemId){
        return orderItemService.getProductId(orderItemId);
    }

    @GetMapping( "/getProductIds/{orderId}")
    private List<Long> getOrderProductIds(@PathVariable Long orderId){
        return orderItemService.getOrdersProductId(orderId);
    }






}
