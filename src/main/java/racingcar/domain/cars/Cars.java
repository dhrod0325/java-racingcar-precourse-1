package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import racingcar.domain.car.Car;
import racingcar.domain.car.move.CarMove;

public class Cars implements Iterable<Car> {
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

    public String display() {
        List<String> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.display());
        }

        return String.join("\n", result);
    }

    public List<String> getNames() {
        List<String> result = new ArrayList<>();

        for (Car car : this) {
            result.add(car.getCarName().get());
        }

        return result;
    }

    @Override
    public Iterator<Car> iterator() {
        return carList.iterator();
    }
}
