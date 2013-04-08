package domain;

import core.annotation.Component;
import core.annotation.Qualified;
import core.scopes.Prototype;

import javax.inject.Inject;

@Component
@Prototype
public class AppRunner {
    private Vehicle car;
    @Inject @Qualified(id="truck") private Vehicle truck;
    private Vehicle multiWheel;

    private Vehicle jeep;

    @Inject public AppRunner(@Qualified(id="car")Vehicle car, @Qualified(id="multiwheel")Vehicle multiWheel) {
        this.car = car;
        this.multiWheel = multiWheel;
    }

    @Inject @Qualified(id="jeep")
    public void setJeep(Vehicle jeep) {
        this.jeep = jeep;
    }

    public void run() {
        car.run();
        truck.run();
        jeep.run();
        multiWheel.run();
    }

    public void setTruck(Vehicle truck) {
        this.truck = truck;
    }
}
