package racingcar.domain.cars.filter;

import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.cars.Cars;

public class CarsFilter {
    public static Cars maxMoved(List<Car> carList) {
        CarsMaxMoved carsMaxMoved = new CarsMaxMoved(carList);
        CarsMaxPosition carsMaxPosition = new CarsMaxPosition(carList);

        return new Cars(carsMaxMoved.get(carsMaxPosition.get()));
    }
}
