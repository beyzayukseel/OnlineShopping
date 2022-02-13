package com.example.trcombeyzashopping.service;
import com.example.trcombeyzashopping.dto.ProductDto;
import com.example.trcombeyzashopping.model.Product;
import com.example.trcombeyzashopping.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
         productRepository.deleteById(id);
    }
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }


}
