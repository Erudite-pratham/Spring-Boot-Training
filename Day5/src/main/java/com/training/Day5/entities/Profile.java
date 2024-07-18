package com.training.Day5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name = "profiles")
@Data
public class Profile {

    @Id
    private int id;

    private String bio;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
