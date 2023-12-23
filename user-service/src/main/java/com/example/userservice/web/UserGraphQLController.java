package com.example.userservice.web;

import com.example.userservice.service.UserManagerAction;
import com.example.userservice.service.dtos.UserDtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserGraphQLController {

    @Autowired
    private UserManagerAction userManagerAction;

    @QueryMapping
    public UserDtos getUserById(@Argument Long id) {
        return userManagerAction.getUserById(id);
    }

    @MutationMapping
    public UserDtos saveUser(UserDtos userDto) {
        return userManagerAction.saveUser(userDto);
    }
}
