package racingcar.domain;

import racingcar.domain.status.MoveStatus;

public class Race {
    private final Cars cars;
    private final RaceCount raceCount;

    public Race(Cars cars, RaceCount raceCount) {
        this.raceCount = raceCount;
        this.cars = cars;
    }

    public void start(MoveStatus moveStatus) {
        for (int i = 0; i < raceCount.get(); i++) {
            cars.move(moveStatus);
        }
    }

    public String displayCars() {
        return cars.display();
    }

    public String displayWinners() {
        return String.join(",", winners().getNames());
    }

    private Cars winners() {
        return cars.getMaximumPositionCars();
    }
}
