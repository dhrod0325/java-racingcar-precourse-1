package racingcar.domain;

import racingcar.domain.status.MoveStatus;

public class Car implements Comparable<Car> {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public int move(MoveStatus moveStatus) {
        if (moveStatus.isForward()) {
            position++;
        }

        return position;
    }

    public String display() {
        StringBuilder result = new StringBuilder(name);
        result.append(" : ");

        for (int i = 0; i < position; i++) {
            result.append("-");
        }

        return result.toString();
    }

    public boolean isOverPosition(int position) {
        return this.position >= position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public int compareTo(Car o) {
        if (position > o.position) {
            return 1;
        }
        return 0;
    }
}
