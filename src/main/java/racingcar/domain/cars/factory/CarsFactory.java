package racingcar.domain.cars.factory;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.cars.Cars;

public class CarsFactory {
    public static Cars fromNames(String[] names) {
        List<Car> carList = new ArrayList<>();

        for (String carName : names) {
            carList.add(new Car(carName));
        }

        return new Cars(carList);
    }
}
