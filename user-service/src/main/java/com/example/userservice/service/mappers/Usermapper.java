package com.example.userservice.service.mappers;

import com.example.userservice.dao.entities.User;
import com.example.userservice.service.dtos.UserDtos;
import org.modelmapper.ModelMapper;

public class Usermapper {
    private ModelMapper modelMapper = new ModelMapper();

    public UserDtos fromUserToUserDto(User user){
        return this.modelMapper.map(user , UserDtos.class );
    }

    public User fromUserDtoToUser(UserDtos userDtos){
        return this.modelMapper.map(userDtos , User.class );
    }
}
