package racingcar.domain.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarsMaxMoved {
    private final List<Car> carList;

    public CarsMaxMoved(List<Car> carList) {
        this.carList = new ArrayList<>(carList);
    }

    public List<Car> get() {
        int maxPosition = getMaxPosition();

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

    private int getMaxPosition() {
        List<Car> result = new ArrayList<>(carList);

        Collections.sort(result);

        if (result.isEmpty()) {
            return 0;
        }

        return result.get(0).getPosition();
    }
}
