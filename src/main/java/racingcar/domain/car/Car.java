package racingcar.domain.car;

import java.util.Objects;
import racingcar.domain.engine.Engine;

public class Car implements Comparable<Car> {
    private final CarName carName;
    private final CarPosition position;

    public Car(String name) {
        this.carName = new CarName(name);
        this.position = new CarPosition(0);
    }

    public void move(Engine carEngine) {
        if (carEngine.isForward()) {
            position.plus();
        }
    }

    public CarName getCarName() {
        return carName;
    }

    public CarPosition getPosition() {
        return position;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(carName.get());
        result.append(" : ");

        for (int i = 0; i < position.get(); i++) {
            result.append("-");
        }

        return result.toString();
    }

    @Override
    public int compareTo(Car o) {
        return o.position.get() - position.get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
