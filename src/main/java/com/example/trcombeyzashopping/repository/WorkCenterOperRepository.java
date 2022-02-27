package com.example.trcombeyzashopping.repository;

import com.example.trcombeyzashopping.model.WorkCenterOper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkCenterOperRepository extends JpaRepository<WorkCenterOper, Long> {

}
