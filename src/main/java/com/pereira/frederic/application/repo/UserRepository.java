package com.pereira.frederic.application.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pereira.frederic.application.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(" select u from User u " +
            " where u.username = ?1")
    Optional<User> findUserWithName(String username);
}