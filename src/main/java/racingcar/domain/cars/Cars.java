package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.engine.Engine;

public class Cars {
    private final List<Car> carList;
    private final CarsName carsName;

    public Cars(List<Car> carList) {
        this.carList = carList;
        this.carsName = new CarsName(carList);
    }

    public void move(Engine engine) {
        for (Car car : carList) {
            car.move(engine);
        }
    }

    public CarsName getCarsName() {
        return carsName;
    }

    @Override
    public String toString() {
        List<String> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.toString());
        }

        return String.join("\n", result);
    }

    public List<Car> asList() {
        return carList;
    }
}
