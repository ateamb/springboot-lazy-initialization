package com.javabanters.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//marks the class as a spring bean
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In Constructor "+ getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice fast bowling for 20 mins";
    }
}
