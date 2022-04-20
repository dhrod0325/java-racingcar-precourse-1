package racingcar.domain.race;

import racingcar.domain.cars.Cars;
import racingcar.domain.engine.Engine;

public class Race {
    private final Cars cars;
    private final RaceCount raceCount;
    private final RaceMonitor monitor;
    private final Engine raceEngine;

    public Race(Cars cars, RaceCount raceCount, RaceMonitor monitor, Engine raceEngine) {
        this.raceCount = raceCount;
        this.cars = cars;
        this.monitor = monitor;
        this.raceEngine = raceEngine;
    }

    public RaceResult start() {
        monitor.clear();

        RaceResult result = new RaceResult(cars);

        for (int i = 0; i < raceCount.get(); i++) {
            cars.move(raceEngine);
            monitor.add(cars.toString());
        }

        return result;
    }

    public String monitor() {
        return monitor.display();
    }
}
