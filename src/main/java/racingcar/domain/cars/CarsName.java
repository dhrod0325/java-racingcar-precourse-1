package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;

public class CarsName {
    private final List<Car> carList;

    public CarsName(List<Car> carList) {
        this.carList = carList;
    }

    public List<String> getNames() {
        List<String> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.getCarName().get());
        }

        return result;
    }
}
