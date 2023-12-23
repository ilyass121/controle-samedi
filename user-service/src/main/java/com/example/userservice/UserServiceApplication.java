package com.example.userservice;

import com.example.userservice.dao.entities.User;
import com.example.userservice.dao.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository) {
        return args -> {
            List<User> userList = List.of(
                    User.builder().name("John").email("john@example.com").dateNaissance("1990-01-01").password("password1").build(),
                    User.builder().name("Jane").email("jane@example.com").dateNaissance("1995-02-15").password("password2").build(),
                    User.builder().name("Bob").email("bob@example.com").dateNaissance("1985-07-20").password("password3").build(),
                    User.builder().name("Alice").email("alice@example.com").dateNaissance("1992-11-30").password("password4").build()
            );
            userRepository.saveAll(userList);
        };
    }
}
