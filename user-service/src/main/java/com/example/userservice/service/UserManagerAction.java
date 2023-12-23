package com.example.userservice.service;

import com.example.userservice.service.dtos.UserDtos;

public interface UserManagerAction {
    public UserDtos getUserById(Long id);
    public UserDtos saveUser(UserDtos userDto);
}
