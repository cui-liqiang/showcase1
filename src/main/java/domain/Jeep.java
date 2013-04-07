package domain;

import core.annotation.Component;

@Component("jeep")
public class Jeep implements Vehicle{
    public void run() {
        System.out.println("jeep is running");
    }
}
