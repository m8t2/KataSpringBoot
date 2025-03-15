package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> findAllUsers();

    void deleteUser(Long id);

    void updateUser(User user);

    User findUser(Long id);
}
