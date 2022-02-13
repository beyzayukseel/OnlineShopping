package com.example.trcombeyzashopping.service;

import com.example.trcombeyzashopping.exception.IdNotFoundException;
import com.example.trcombeyzashopping.model.OrderItem;
import com.example.trcombeyzashopping.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService  {

    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public OrderItem addOrderItem(OrderItem orderItem){
         return orderItemRepository.save(orderItem);
    }

    public List<OrderItem> allOrderItems(){
        return orderItemRepository.findAll();
    }

    public void delOrderItem(Long id){
        if (orderItemRepository.existsById(id)) {
            orderItemRepository.deleteById(id);
        }else{
            throw new IdNotFoundException( "couldnt find id: "+ id); }

    }

    public List<OrderItem> getOrderItems(Long orderId){
        return orderItemRepository.findByOrderId(orderId);
    }
}
