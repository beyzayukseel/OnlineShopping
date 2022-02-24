package com.example.trcombeyzashopping.controller;

import com.example.trcombeyzashopping.service.OrderItemService;
import com.example.trcombeyzashopping.service.SubProductTreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping( "/subProduct")
public class SubProductTreeController {

    private final SubProductTreeService subProductTreeService;
    private final OrderItemService orderItemService;


    @GetMapping( "/{orderId}/getSubProducts")
    private ResponseEntity<List<Long>> findSubProduct(@PathVariable Long orderId){
        return ResponseEntity.ok(subProductTreeService.getOrdersSubProduct(orderItemService.getOrdersProductId(orderId)));
    }
}
