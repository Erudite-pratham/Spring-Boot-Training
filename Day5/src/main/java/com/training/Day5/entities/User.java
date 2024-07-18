package com.training.Day5.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private int id;

    private String name;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profile profile;

}


//
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Post> postList;
