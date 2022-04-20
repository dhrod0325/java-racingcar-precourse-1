package racingcar.domain.race;

import racingcar.domain.car.Cars;

public class RaceBuilder {
    private Cars cars;
    private RaceCount raceCount;

    public RaceBuilder setCars(Cars cars) {
        this.cars = cars;
        return this;
    }

    public RaceBuilder setRaceCount(RaceCount raceCount) {
        this.raceCount = raceCount;
        return this;
    }

    public Race build() {
        return new Race(cars, raceCount);
    }
}
