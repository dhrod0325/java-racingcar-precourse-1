package racingcar.domain.race;

import racingcar.domain.cars.Cars;
import racingcar.domain.engine.Engine;

public class Race {
    private final Cars cars;
    private final RaceCount raceCount;
    private final RaceMonitor monitor;

    public Race(Cars cars, RaceCount raceCount, RaceMonitor monitor) {
        this.raceCount = raceCount;
        this.cars = cars;
        this.monitor = monitor;
    }

    public RaceResult start(Engine engine) {
        monitor.clear();

        RaceResult result = new RaceResult(cars);

        for (int i = 0; i < raceCount.get(); i++) {
            cars.move(engine);
            monitor.add(cars.toString());
        }

        return result;
    }

    public String monitor() {
        return monitor.display();
    }
}
