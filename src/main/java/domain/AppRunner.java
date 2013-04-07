package domain;

import core.annotation.Component;
import javax.inject.Inject;

@Component
public class AppRunner {
    private Vehicle car;
    @Inject private Vehicle truck;

    private Vehicle jeep;

    @Inject public AppRunner(Vehicle car) {
        this.car = car;
    }

    @Inject
    public void setJeep(Vehicle jeep) {
        this.jeep = jeep;
    }

    public void run() {
        car.run();
        truck.run();
        jeep.run();
    }

    public void setTruck(Vehicle truck) {
        this.truck = truck;
    }
}
