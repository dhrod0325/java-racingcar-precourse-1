package racingcar;

public class Car {
    private CarStatus status;

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
}
