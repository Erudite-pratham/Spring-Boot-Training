package com.training.Day3.controllers;

import com.training.Day3.enities.User;
import com.training.Day3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // localhost:8080/users
    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    // localhost:8080/users
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // localhost:8080/users/{id}
    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Long id){
        return userService.deletedUser(id);
    }

    // /users/email
//    @GetMapping("/{email}")
//    public User getAllUsers(@PathVariable String  email){
//        return userService.findByEmail(email);
//    }

    // /users/character
    @GetMapping("/{character}")
    public List<User> findUsersStartingWithA(@PathVariable Character  character){
        return userService.findUsersStartingWithA(character);
    }

    // more mapping
}
