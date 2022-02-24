package com.example.trcombeyzashopping.repository;

import com.example.trcombeyzashopping.model.Order;
import com.example.trcombeyzashopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
