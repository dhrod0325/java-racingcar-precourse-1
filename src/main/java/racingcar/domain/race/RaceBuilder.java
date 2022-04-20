package racingcar.domain.race;

import racingcar.domain.cars.Cars;
import racingcar.domain.engine.Engine;

public class RaceBuilder {
    private Cars cars;
    private RaceRoundCount raceRoundCount;
    private RaceMonitor raceMonitor;
    private Engine raceEngine;

    public RaceBuilder setCars(Cars cars) {
        this.cars = cars;
        return this;
    }

    public RaceBuilder setRaceRoundCount(RaceRoundCount raceRoundCount) {
        this.raceRoundCount = raceRoundCount;
        return this;
    }

    public RaceBuilder setRaceMonitor(RaceMonitor raceMonitor) {
        this.raceMonitor = raceMonitor;

        return this;
    }

    public RaceBuilder setRaceEngine(Engine raceEngine) {
        this.raceEngine = raceEngine;

        return this;
    }

    public Race build() {
        return new Race(cars, raceRoundCount, raceMonitor, raceEngine);
    }
}
