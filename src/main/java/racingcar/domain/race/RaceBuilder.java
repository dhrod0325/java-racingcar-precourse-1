package racingcar.domain.race;

import racingcar.domain.cars.Cars;

public class RaceBuilder {
    private Cars cars;
    private RaceCount raceCount;
    private RaceMonitor monitor;

    public RaceBuilder setCars(Cars cars) {
        this.cars = cars;
        return this;
    }

    public RaceBuilder setRaceCount(RaceCount raceCount) {
        this.raceCount = raceCount;
        return this;
    }

    public RaceBuilder setMonitor(RaceMonitor monitor) {
        this.monitor = monitor;

        return this;
    }

    public Race build() {
        return new Race(cars, raceCount, monitor);
    }
}
