package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.engine.Engine;
import racingcar.domain.validator.CarsValidator;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;

        for (Car car : carList) {
            CarsValidator.validate(carList, car);
        }
    }

    public void move(Engine engine) {
        for (Car car : carList) {
            car.move(engine);
        }
    }

    public CarsName getCarsName() {
        return new CarsName(carList);
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
