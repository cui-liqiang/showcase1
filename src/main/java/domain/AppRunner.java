package domain;

import core.annotation.Component;
import core.annotation.Qualified;

import javax.inject.Inject;

@Component
public class AppRunner {
    private Vehicle car;
    @Inject @Qualified(id="truck") private Vehicle truck;

    private Vehicle jeep;

    @Inject public AppRunner(@Qualified(id="car")Vehicle car) {
        this.car = car;
    }

    @Inject @Qualified(id="jeep")
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
