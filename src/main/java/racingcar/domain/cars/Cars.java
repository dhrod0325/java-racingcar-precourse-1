package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.engine.Engine;

public class Cars {
    public static final String MSG_INVALID_NAME = "같은 이름의 차를 만들 수 없습니다.";

    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;

        for (Car car : carList) {
            validate(car);
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

    public List<Car> toList() {
        return carList;
    }

    public void validate(Car car) {
        if (carList.contains(car)) {
            throw new IllegalStateException(MSG_INVALID_NAME);
        }
    }
}
