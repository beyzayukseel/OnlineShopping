package com.example.trcombeyzashopping.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Data
public class UserDto {
    private Long id;
    private String name;
}
