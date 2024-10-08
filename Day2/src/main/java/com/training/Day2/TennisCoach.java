package com.training.Day2;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getWorkout() {
        return "Workout from Tennis Coach";
    }

    @Override
    public String getMyKit() {
        return "Kit from tennis coach";
    }

}
