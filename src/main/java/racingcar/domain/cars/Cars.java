package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.move.CarMove;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public Cars filterMaxMoved() {
        return CarsFilter.maxMoved(carList);
    }

    public void move(CarMove carMove) {
        for (Car car : carList) {
            car.move(carMove);
        }
    }

    public List<String> toNames() {
        return new CarsName(carList).getNames();
    }

    @Override
    public String toString() {
        List<String> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.toString());
        }

        return String.join("\n", result);
    }

    public List<Car> toList() {
        return carList;
    }
}
