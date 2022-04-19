package racingcar.domain;

import racingcar.domain.status.MoveStatus;

public class Race {
    private final Cars cars;
    private final int gameCount;

    public Race(Cars cars, int gameCount) {
        this.gameCount = gameCount;
        this.cars = cars;
    }

    public String start(MoveStatus moveStatus) {
        for (int i = 0; i < gameCount; i++) {
            cars.move(moveStatus);
        }

        return cars.display();
    }

    public String displayWinners() {
        return String.join(",", winners().getNames());
    }

    private Cars winners() {
        return cars.getMaximumPositionCars();
    }
}
