package com.example.trcombeyzashopping.dto;

import com.example.trcombeyzashopping.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Builder
@Setter
@Getter
@Data
public class OrderDto {

    @JsonFormat(pattern="MM/dd/yyyy")
    private String deadline;

    @JsonFormat(pattern="MM/dd/yyyy")
    private String date;

    private User user;



}
