package org.training;

public class TennisCoach implements Coach {

    SportsKit sportsKit;

    @Override
    public String sayHello(){
        return "Hello from tennis coach";
    }

    @Override
    public String getSportsKit() {
        return "";
    }

    public void setSportsKit(SportsKit sportsKit) {
        this.sportsKit = sportsKit;
    }
}
