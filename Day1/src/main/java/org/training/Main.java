package org.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //        CricketCoach coach = new CricketCoach();
//        System.out.println(coach.sayHello());

//        TennisCoach coach1 = new TennisCoach();
//        System.out.println(coach1.sayHello());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Coach coach = (Coach) context.getBean("coach1");
        System.out.println(coach.sayHello());
    }
}