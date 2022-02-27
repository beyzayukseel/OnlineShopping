package com.example.trcombeyzashopping.service;

import com.example.trcombeyzashopping.model.WorkCenter;
import com.example.trcombeyzashopping.repository.WorkCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class WorkCenterService {

    private final WorkCenterRepository workCenterRepository;

    public WorkCenter saveWorkCenter(WorkCenter workCenter) {
        return workCenterRepository.save(workCenter);
    }

    public List<WorkCenter> getAllWorkCenters() {
        return workCenterRepository.findAll();
    }

    public void deleteWorkCenter(Long workCenterId) {
        workCenterRepository.deleteById(workCenterId);
    }
}
