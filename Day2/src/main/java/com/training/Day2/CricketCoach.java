package com.training.Day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// cricketCoach
@Component
public class CricketCoach implements Coach{

    @Autowired
    SportsKit sportsKit;

    @Override
    public String getWorkout() {
        return "Workout from Cricket Coach";
    }

}
