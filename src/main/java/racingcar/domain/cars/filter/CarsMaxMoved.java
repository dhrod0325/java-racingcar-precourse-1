package racingcar.domain.cars.filter;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarPosition;

public class CarsMaxMoved {
    private final List<Car> carList;

    public CarsMaxMoved(List<Car> carList) {
        this.carList = new ArrayList<>(carList);
    }

    public List<Car> get(CarPosition maxPosition) {
        List<Car> result = new ArrayList<>();

        for (Car car : carList) {
            add(result, car, maxPosition);
        }

        return result;
    }

    private void add(List<Car> result, Car car, CarPosition maxPosition) {
        if (!car.getPosition().isOver(maxPosition.get())) {
            return;
        }

        result.add(car);
    }
}
