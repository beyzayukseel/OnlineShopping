package com.example.trcombeyzashopping.repository;

import com.example.trcombeyzashopping.model.SubProductTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SubProductTreeRepository extends JpaRepository<SubProductTree, Long> {

    @Query("SELECT s.subProductId.subProductId FROM SubProductTree s WHERE s.product.id = ?1")
    List<Long> findSubProductsOfProduct(Long id);
}
