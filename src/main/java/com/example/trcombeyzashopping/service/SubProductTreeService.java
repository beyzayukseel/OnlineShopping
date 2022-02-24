package com.example.trcombeyzashopping.service;
import com.example.trcombeyzashopping.model.OrderItem;
import com.example.trcombeyzashopping.model.SubProductId;
import com.example.trcombeyzashopping.model.SubProductTree;
import com.example.trcombeyzashopping.repository.SubProductTreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SubProductTreeService {

    private final SubProductTreeRepository subProductTreeRepository;

    public List<Long> getOrdersSubProduct(List<Long> productIdList){
        System.out.println( "poductid Lİst:");
        System.out.println(productIdList.size());
        List<Long> subItems = new ArrayList<>();
        for (Long element : productIdList){
            System.out.println(element);
            subItems.add(element);
            System.out.println(subProductTreeRepository.findSubProductsOfProduct(element));

        }
        return subItems;
    }

}
