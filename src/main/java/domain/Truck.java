package domain;

import core.annotation.Component;

@Component("truck")
public class Truck implements Vehicle{
    public void run() {
        System.out.println("truck is running");
    }
}
