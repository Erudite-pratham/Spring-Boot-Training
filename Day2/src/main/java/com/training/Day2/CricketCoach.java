package com.training.Day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// cricketCoach
@Component
@Scope("prototype")
public class CricketCoach implements Coach{

    @Autowired
    SportsKit sportsKit;

    @Override
    public String getWorkout() {
        return "Workout from Cricket Coach";
    }

    @Override
    public String getMyKit(){
        return sportsKit.getMyKit();
    }

}
