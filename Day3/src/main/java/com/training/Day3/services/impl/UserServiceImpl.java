package com.training.Day3.services.impl;

import com.training.Day3.enities.User;
import com.training.Day3.repo.UserRepository;
import com.training.Day3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User deletedUser(Long id) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);

    }

    @Override
    public List<User> findUsersStartingWithA(Character character) {
        return userRepository.findUsersStartingWithA(character);
    }
}
