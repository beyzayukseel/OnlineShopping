package com.example.trcombeyzashopping.repository;

import com.example.trcombeyzashopping.model.WorkCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorkCenterRepository extends JpaRepository<WorkCenter,Long> {

}
