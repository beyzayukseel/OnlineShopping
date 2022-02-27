package com.example.trcombeyzashopping.dto.dtoMapper;

import com.example.trcombeyzashopping.dto.WorkCenterDto;
import com.example.trcombeyzashopping.model.WorkCenter;
import org.springframework.stereotype.Component;

@Component
public class WorkCenterMapper {

    public WorkCenter convertToWorkCenter(WorkCenterDto workCenterDto) {
        return WorkCenter.builder()
                .workCenterName(workCenterDto.getWorkCenterName())
                .active(workCenterDto.getActive())
                .build();
    }
}
