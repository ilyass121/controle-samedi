package com.example.userservice.service;

import com.example.userservice.dao.repositories.UserRepository;
import com.example.userservice.service.dtos.UserDtos;
import com.example.userservice.service.mappers.Usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager implements UserManagerAction{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Usermapper userMapper;

    @Override
    public UserDtos getUserById(Long id) {
        return userMapper.fromUserToUserDto(userRepository.findById(id).get());
    }

    @Override
    public UserDtos saveUser(UserDtos userDto) {
        return userMapper.fromUserToUserDto(userRepository.save(userMapper.fromUserDtoToUser(userDto)));
    }
}
