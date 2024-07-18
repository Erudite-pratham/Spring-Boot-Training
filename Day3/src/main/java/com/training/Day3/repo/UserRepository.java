package com.training.Day3.repo;

import com.training.Day3.enities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.name LIKE :character%")
    List<User> findUsersStartingWithA(Character character);
}
