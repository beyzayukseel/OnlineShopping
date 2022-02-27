package com.example.trcombeyzashopping.controller;

import com.example.trcombeyzashopping.model.WorkCenter;
import com.example.trcombeyzashopping.service.WorkCenterOperService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/workCenterOper")
public class WorkCenterOperController {

    private final WorkCenterOperService workCenterOperService;

    @PostMapping("/addWorkCenterOper")
    private ResponseEntity<WorkCenter> addWorkCenterOper(WorkCenterOperDto workCenterOperDto) {
        return ResponseEntity.ok(workCenterService.saveWorkCenter(workCenterMapper.convertToWorkCenter(workCenterDto)));
    }

    @GetMapping("/allWorkCenterOperations")
    private ResponseEntity<List<WorkCenter>> getWorkCenters() {
        return ResponseEntity.ok(workCenterService.getAllWorkCenters());
    }

    @DeleteMapping("/deleteWorkCenter/{workCenterOperId}")
    private void delWorkCenterOper(@PathVariable Long workCenterOperId) {
        workCenterService.deleteWorkCenter(workCenterOperId);
    }
}
}
