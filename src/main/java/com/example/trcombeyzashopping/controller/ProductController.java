package com.example.trcombeyzashopping.controller;


import com.example.trcombeyzashopping.dto.ProductDto;
import com.example.trcombeyzashopping.dto.dtoConverter.ProductConverter;
import com.example.trcombeyzashopping.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping( "/product")
public class ProductController {

    private final ProductService productService;
    private final ProductConverter productConverter;

    @PostMapping("/add")
    private ResponseEntity<ProductDto> saveProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productConverter.toProductDto(productService.addProduct(productConverter.toProduct(productDto))));
     }

    @GetMapping("/all")
    private ResponseEntity<List<ProductDto>> gelAllProduct() {
        return ResponseEntity.ok(productConverter.toProductDtoList(productService.getAllProduct()));
    }



}
