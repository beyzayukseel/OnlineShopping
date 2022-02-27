package com.example.trcombeyzashopping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping( "/workCenter")
public class WorkCenterController {

    private final WorkCenterService workCenterService;
    private final WorkCenterMapper workCenterMapper;

    @PostMapping("/addWorkCenter")
    private ResponseEntity<WorkCenter> addWorkCenter(WorkCenterDto workCenterDto){
        return ResponseEntity.ok(workCenterService.saveWorkCenter(workCenterMapper.convertToWorkCenter(workCenterDto)));
    }

    @GetMapping( "/allWorkCenters")
            private ResponseEntity<List<WorkCenter>> getWorkCenters(){
        return ResponseEntity.ok(workCenterService.getAllWorkCenters());
    }

    @DeleteMapping( "/deleteWorkCenter/{workCenterId}")
    private void delWorkCenter(@PathVariable Long workCenterId){
         workCenterService.deleteWorkCenter(workCenterId);
    }
}
