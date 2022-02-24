package com.example.trcombeyzashopping.dto.dtoMapper;

import com.example.trcombeyzashopping.dto.ProductDto;
import com.example.trcombeyzashopping.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {


    public ProductDto toProductDto(Product product) {
        return ProductDto.builder()
                .productName(product.getProductName())
                .productType(product.getProductType())
                .salable(product.getSalable())
                .build();
    }

    public Product toProduct(ProductDto productDto) {
        return Product.builder()
                .productName(productDto.getProductName())
                .productType(productDto.getProductType())
                .salable(productDto.getSalable())
                .build();
    }

    public List<ProductDto> toProductDtoList(List<Product> product) {
        return product.stream()
                .map(this::toProductDto)
                .collect(Collectors.toList());
    }

}
