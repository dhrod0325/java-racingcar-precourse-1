package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import racingcar.domain.status.MoveStatus;

public class Cars implements Iterable<Car> {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void move(MoveStatus moveStatus) {
        for (Car car : carList) {
            car.move(moveStatus);
        }
    }

    public String display() {
        List<String> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.display());
        }

        return String.join("\n", result);
    }

    public Cars getMaximumPositionCars() {
        return getOverPositionCars(getMaxPosition());
    }

    public List<String> getNames() {
        List<String> result = new ArrayList<>();

        for (Car car : this) {
            result.add(car.getName());
        }

        return result;
    }

    private List<Car> sorted() {
        List<Car> result = new ArrayList<>(carList);
        Collections.sort(result);
        return result;
    }

    private Cars getOverPositionCars(int position) {
        List<Car> result = new ArrayList<>();

        for (Car car : this) {
            addOverPositionCar(result, car, position);
        }

        return new Cars(result);
    }

    private int getMaxPosition() {
        List<Car> result = sorted();

        if (result.isEmpty()) {
            return 0;
        }

        return result.get(0).getPosition();
    }

    private void addOverPositionCar(List<Car> result, Car car, int position) {
        if (!car.isOverPosition(position)) {
            return;
        }

        result.add(car);
    }

    @Override
    public Iterator<Car> iterator() {
        return carList.iterator();
    }
}
