package com.training.Day3.enities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
public class User {

    // primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    // its is a not null column
    @Column(nullable = false)
    String name;

    // this column in not null as well as unique
    @Column(nullable = false,unique = true)
    String email;

//    String username;

}
