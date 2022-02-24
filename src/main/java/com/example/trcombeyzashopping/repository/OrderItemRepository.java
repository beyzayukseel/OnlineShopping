package com.example.trcombeyzashopping.repository;

import com.example.trcombeyzashopping.model.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository <OrderItem, Long>{

    List<OrderItem> findByOrderId(Long orderId);

    @Query( "SELECT t.product.id FROM OrderItem t WHERE t.id= ?1")
    Long selectProductId(Long order_item_id);

}
