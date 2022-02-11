package com.example.trcombeyzashopping.service;

import com.example.trcombeyzashopping.model.Order;
import com.example.trcombeyzashopping.model.Product;
import com.example.trcombeyzashopping.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public Order addOrder(Order order){
      return orderRepository.save(order);
    }

    public List<Order> findOrdersUser(Long userId){
        return orderRepository.findByUserId(userId);
    }

    public List<Order> getAll(){
        return orderRepository.findAll();
    }

    public void delOrder(Long id){
         orderRepository.deleteById(id);
    }
}
