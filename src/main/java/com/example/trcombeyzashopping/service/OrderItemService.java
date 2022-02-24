package com.example.trcombeyzashopping.service;

import com.example.trcombeyzashopping.model.OrderItem;
import com.example.trcombeyzashopping.repository.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.trcombeyzashopping.model.Salable.NO;

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
            orderItemRepository.deleteById(id);
    }

    public List<OrderItem> getOrderItems(Long orderId){
        return orderItemRepository.findByOrderId(orderId);
    }

    public Long getProductId(Long orderItemId){
        return orderItemRepository.selectProductId(orderItemId);
    }

    public List<Long> getOrdersProductId(Long orderId){
        List<OrderItem> orderItems = orderItemRepository.findByOrderId(orderId);
        List<Long> productIdList = new ArrayList<>();
        for (OrderItem items : orderItems){
            System.out.println(items.getProduct().getId());
            if (items.getProduct().getSalable() ==  NO){
                productIdList.add(items.getProduct().getId());
            }
        }
        return productIdList;
    }
}
