package domain;

import core.annotation.Component;
import javax.inject.Inject;

@Component
public class AppRunner {
    private Car car;

    @Inject public AppRunner(Car car) {
        this.car = car;
    }

    public void run() {
        car.run();
    }
}
