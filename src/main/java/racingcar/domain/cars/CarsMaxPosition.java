package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import racingcar.domain.car.Car;

public class CarsMaxPosition {
    private final List<Car> carList;

    public CarsMaxPosition(List<Car> carList) {
        this.carList = carList;
    }

    public int get() {
        List<Car> result = new ArrayList<>(carList);

        Collections.sort(result);

        if (result.isEmpty()) {
            return 0;
        }

        return result.get(0).getPosition().get();
    }
}
