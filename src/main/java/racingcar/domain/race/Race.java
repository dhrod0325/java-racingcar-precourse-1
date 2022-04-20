package racingcar.domain.race;

import racingcar.domain.cars.Cars;
import racingcar.domain.engine.Engine;

public class Race {
    private final Cars cars;
    private final RaceRoundCount raceRoundCount;
    private final RaceMonitor monitor;
    private final Engine raceEngine;

    public Race(Cars cars, RaceRoundCount raceRoundCount, RaceMonitor monitor, Engine raceEngine) {
        this.raceRoundCount = raceRoundCount;
        this.cars = cars;
        this.monitor = monitor;
        this.raceEngine = raceEngine;
    }

    public RaceResult start() {
        monitor.clear();

        RaceResult result = new RaceResult(cars);

        for (int i = 0; i < raceRoundCount.get(); i++) {
            cars.move(raceEngine);
            monitor.add(cars.toString());
        }

        return result;
    }

    public String monitor() {
        return monitor.display();
    }
}
