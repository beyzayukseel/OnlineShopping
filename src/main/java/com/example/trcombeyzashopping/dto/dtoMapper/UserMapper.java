package com.example.trcombeyzashopping.dto.dtoMapper;

import com.example.trcombeyzashopping.dto.UserDto;
import com.example.trcombeyzashopping.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto convertDto(User user){
        return UserDto.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .build();

    }
}
