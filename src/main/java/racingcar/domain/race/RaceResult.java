package racingcar.domain.race;

import java.util.List;
import racingcar.domain.cars.Cars;
import racingcar.domain.cars.CarsName;
import racingcar.domain.cars.filter.CarsFilter;

public class RaceResult {
    private final Cars cars;

    public RaceResult(Cars cars) {
        this.cars = cars;
    }

    public Cars getWinners() {
        return CarsFilter.maxMoved(cars);
    }

    public CarsName winnerCarsName() {
        return getWinners().getCarsName();
    }

    public List<String> winnerCarsNameList() {
        return winnerCarsName().toStringList();
    }

    public String winnerNames() {
        return String.join(",", winnerCarsNameList());
    }
}
