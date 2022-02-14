package com.example.trcombeyzashopping.controller;


import com.example.trcombeyzashopping.model.Order;
import com.example.trcombeyzashopping.service.OrderItemService;
import com.example.trcombeyzashopping.service.SubProductTreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping( "/subProduct")
public class SubProductTreeController {

    private final SubProductTreeService subProductTreeService;
    private final OrderItemService orderItemService;

    private ResponseEntity<?> findSubProducts(Order order){
      orderItemService.getOrderItems(order.getId());
      //liste order itemslari eqle
        // subproduct a git listin her elemani iicin teqer teqer arat
        //
    }

}
