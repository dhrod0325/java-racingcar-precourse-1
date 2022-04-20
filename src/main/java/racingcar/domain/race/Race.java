package racingcar.domain.race;

import java.util.List;
import racingcar.domain.car.move.CarMove;
import racingcar.domain.cars.Cars;
import racingcar.domain.cars.CarsName;

public class Race {
    private final Cars cars;
    private final RaceCount raceCount;
    private final RaceResult raceResult;

    public Race(Cars cars, RaceCount raceCount, RaceResult raceResult) {
        this.raceCount = raceCount;
        this.cars = cars;
        this.raceResult = raceResult;
    }

    public void start(CarMove carMove) {
        raceResult.clear();

        for (int i = 0; i < raceCount.get(); i++) {
            cars.move(carMove);
            raceResult.addResult(cars.toString());
        }

        raceResult.addResultWinners(winnerCarsNameList());
    }

    public RaceResult getRaceResult() {
        return raceResult;
    }

    public Cars winners() {
        return cars.filterMaxMoved();
    }

    public CarsName winnerCarsName() {
        return winners().getCarsName();
    }

    public List<String> winnerCarsNameList() {
        return winnerCarsName().toStringList();
    }
}
