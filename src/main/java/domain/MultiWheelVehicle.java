package domain;

public class MultiWheelVehicle implements Vehicle{
    private int numberOfWheel;

    public MultiWheelVehicle(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    @Override
    public void run() {
        System.out.println("multiWheelVehicle is running with " + numberOfWheel + " wheels");
    }
}
