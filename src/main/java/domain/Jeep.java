package domain;

import core.annotation.Component;

@Component
public class Jeep implements Vehicle{
    public void run() {
        System.out.println("jeep is running");
    }
}
