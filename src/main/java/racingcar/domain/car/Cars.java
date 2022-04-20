package racingcar.domain.car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import racingcar.domain.car.move.CarMove;

public class Cars implements Iterable<Car> {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public static Cars fromNames(String[] names) {
        List<Car> carList = new ArrayList<>();

        for (String carName : names) {
            carList.add(new Car(carName));
        }

        return new Cars(carList);
    }

    public void move(CarMove carMove) {
        for (Car car : carList) {
            car.move(carMove);
        }
    }

    public Cars toMaxMoved() {
        return new Cars(new CarsMaxMoved(carList).get());
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
