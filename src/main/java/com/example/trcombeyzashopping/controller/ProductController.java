package com.example.trcombeyzashopping.controller;


import com.example.trcombeyzashopping.dto.ProductDto;
import com.example.trcombeyzashopping.dto.dtoMapper.ProductMapper;
import com.example.trcombeyzashopping.model.Product;
import com.example.trcombeyzashopping.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping( "/product")
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;


    @PostMapping("/add")
    private ResponseEntity<Product> saveProduct(@RequestBody ProductDto productDto) {

        return ResponseEntity.ok(productService.addProduct(productMapper.toProduct(productDto)));
     }

    @GetMapping("/all")
    private ResponseEntity<List<Product>> gelAllProduct() {
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @DeleteMapping("/del/{delId}")
    private void delProduct(@PathVariable Long delId){
          productService.deleteProduct(delId);
    }



}
