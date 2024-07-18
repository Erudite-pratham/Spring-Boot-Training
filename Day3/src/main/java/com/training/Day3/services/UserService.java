package com.training.Day3.services;



import com.training.Day3.enities.User;

import java.util.List;

public interface UserService {

    // add user
    User addUser(User user);

    // get all users
    List<User> getAllUsers();

    // delete user
    User deletedUser(Long id);

    User findByEmail(String email);

    List<User> findUsersStartingWithA(Character character);
}
