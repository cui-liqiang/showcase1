package domain;

import core.annotation.Component;

import javax.inject.Inject;

@Component
public class MultiWheelVehicle implements Vehicle{
    private int numberOfWheel;

    @Inject public MultiWheelVehicle(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    @Override
    public void run() {
        System.out.println("multiWheelVehicle is running with " + numberOfWheel + "wheels");
    }
}
