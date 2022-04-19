package racingcar;

public class Car {
    private final String name;
    private int position = 0;

    private CarStatus status;

    public Car(String name) {
        this.name = name;
    }

    public void setState(int number) {
        if (number >= 4) {
            this.status = CarStatus.FORWARD;
        }

        if (number <= 3) {
            this.status = CarStatus.STOP;
        }
    }

    public boolean isForward() {
        return status == CarStatus.FORWARD;
    }

    public boolean isStop() {
        return status == CarStatus.STOP;
    }

    public int move() {
        if (isForward()) {
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
}
