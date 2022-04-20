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

    public RaceResult start(CarMove carMove) {
        RaceResult result = new RaceResult();

        for (int i = 0; i < raceCount.get(); i++) {
            cars.move(carMove);
            result.addResult(cars.display());
        }

        result.addResultWinners(cars.getMaxMovedCars().getNames());

        return result;
    }
}
