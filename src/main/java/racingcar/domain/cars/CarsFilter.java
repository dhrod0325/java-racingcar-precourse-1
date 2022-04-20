package racingcar.domain.cars;

import java.util.List;
import racingcar.domain.car.Car;

public class CarsFilter {
    public static Cars maxMoved(List<Car> carList) {
        CarsMaxMoved carsMaxMoved = new CarsMaxMoved(carList);
        CarsMaxPosition carsMaxPosition = new CarsMaxPosition(carList);

        return new Cars(carsMaxMoved.get(carsMaxPosition.get()));
    }
}
