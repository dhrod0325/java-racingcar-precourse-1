package racingcar.domain.car;

import racingcar.domain.car.move.CarMove;

public class Car implements Comparable<Car> {
    private final CarName carName;
    private final CarPosition position;

    public Car(String name) {
        this.carName = new CarName(name);
        this.position = new CarPosition(0);
    }

    public CarPosition move(CarMove carMove) {
        if (carMove.isForward()) {
            position.plus();
        }

        return position;
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
}
