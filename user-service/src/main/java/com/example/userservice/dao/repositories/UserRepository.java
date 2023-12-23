package com.example.userservice.dao.repositories;

import com.example.userservice.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
