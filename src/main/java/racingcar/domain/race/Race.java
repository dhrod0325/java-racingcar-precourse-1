package racingcar.domain.race;

import racingcar.domain.car.Cars;
import racingcar.domain.car.move.CarMove;

public class Race {
    private final Cars cars;
    private final RaceCount raceCount;

    public Race(Cars cars, RaceCount raceCount) {
        this.raceCount = raceCount;
        this.cars = cars;
    }

    public void start(CarMove carMove) {
        for (int i = 0; i < raceCount.get(); i++) {
            cars.move(carMove);
        }
    }

    public String displayCars() {
        return cars.display();
    }

    public String displayWinners() {
        return String.join(",", winners().getNames());
    }

    private Cars winners() {
        return cars.getMaxMovedCars();
    }
}
