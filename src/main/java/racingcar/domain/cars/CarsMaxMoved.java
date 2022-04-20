package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;

public class CarsMaxMoved {
    private final List<Car> carList;

    public CarsMaxMoved(List<Car> carList) {
        this.carList = new ArrayList<>(carList);
    }

    public List<Car> get(int maxPosition) {
        List<Car> result = new ArrayList<>();

        for (Car car : carList) {
            add(result, car, maxPosition);
        }

        return result;
    }

    private void add(List<Car> result, Car car, int maxPosition) {
        if (!car.isOverPosition(maxPosition)) {
            return;
        }

        result.add(car);
    }
}
