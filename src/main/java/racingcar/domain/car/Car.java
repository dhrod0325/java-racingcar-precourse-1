package racingcar.domain.car;

import racingcar.domain.car.move.CarMove;

public class Car implements Comparable<Car> {
    private final CarName carName;
    private final CarPosition position = new CarPosition(0);

    public Car(String name) {
        this.carName = new CarName(name);
    }

    public int move(CarMove carMove) {
        if (carMove.isForward()) {
            position.plus();
        }

        return position.get();
    }

    public String display() {
        StringBuilder result = new StringBuilder(carName.get());
        result.append(" : ");

        for (int i = 0; i < position.get(); i++) {
            result.append("-");
        }

        return result.toString();
    }

    public CarName getCarName() {
        return carName;
    }

    public boolean isOverPosition(int position) {
        return this.position.isOver(position);
    }

    public int getPosition() {
        return position.get();
    }

    @Override
    public int compareTo(Car o) {
        return o.position.get() - position.get();
    }
}
