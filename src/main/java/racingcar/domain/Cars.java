package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import racingcar.domain.status.CarStatus;

public class Cars implements Iterable<Car> {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void move(CarStatus carStatus) {
        for (Car car : carList) {
            car.move(carStatus);
        }
    }

    public String display() {
        List<String> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.display());
        }

        return String.join("\n", result);
    }

    public List<Car> sorted() {
        List<Car> result = new ArrayList<>(carList);
        Collections.sort(result);
        return result;
    }

    public Cars getOverPositionCars(int position) {
        List<Car> result = new ArrayList<>();

        for (Car car : carList) {
            extracted(position, result, car);
        }

        return new Cars(result);
    }

    private void extracted(int position, List<Car> result, Car car) {
        if (car.isOverPosition(position)) {
            result.add(car);
        }
    }

    @Override
    public Iterator<Car> iterator() {
        return carList.iterator();
    }
}
