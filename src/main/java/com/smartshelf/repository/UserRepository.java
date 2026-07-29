package com.smartshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartshelf.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
