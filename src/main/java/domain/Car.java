package domain;

import core.annotation.Component;

@Component("car")
public class Car implements Vehicle{
    public void run() {
        System.out.println("car is running");
    }
}
