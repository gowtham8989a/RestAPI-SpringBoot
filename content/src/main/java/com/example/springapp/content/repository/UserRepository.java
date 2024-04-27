package com.example.springapp.content.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.content.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}