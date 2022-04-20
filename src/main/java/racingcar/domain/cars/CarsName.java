package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarName;

public class CarsName {
    private final List<Car> carList;

    public CarsName(List<Car> carList) {
        this.carList = carList;
    }

    public List<CarName> getNames() {
        List<CarName> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.getCarName());
        }

        return result;
    }

    public List<String> toStringList() {
        List<String> result = new ArrayList<>();

        for (CarName carName : getNames()) {
            result.add(carName.get());
        }

        return result;
    }

    public String[] toArray() {
        return toStringList().toArray(new String[0]);
    }
}
