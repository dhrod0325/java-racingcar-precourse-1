package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    private CarStatus carStatus;

    public Car(String name) {
        this.name = name;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }

    public int move() {
        if (carStatus.isForward()) {
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

    public boolean isCurrentPosition(int position) {
        return this.position == position;
    }
}
