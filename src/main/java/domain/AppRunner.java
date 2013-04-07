package domain;

import core.annotation.Component;
import javax.inject.Inject;

@Component
public class AppRunner {
    private Car car;
    @Inject private Truck truck;

    private Jeep jeep;

    @Inject public AppRunner(Car car) {
        this.car = car;
    }

    @Inject
    public void setJeep(Jeep jeep) {
        this.jeep = jeep;
    }

    public void run() {
        car.run();
        truck.run();
        jeep.run();
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }
}
