package com.example.trcombeyzashopping.service;
import com.example.trcombeyzashopping.repository.OrderRepository;
import com.example.trcombeyzashopping.repository.ProductRepository;
import com.example.trcombeyzashopping.repository.SubProductTreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SubProductTreeService {

    private final SubProductTreeRepository subProductTreeRepository;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;




}
