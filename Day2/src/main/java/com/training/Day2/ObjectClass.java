package com.training.Day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ObjectClass {

    @Autowired
    @Qualifier("cricketCoach")
    Coach coach;

    public String hello(){
        return coach.getWorkout();
    }
}
