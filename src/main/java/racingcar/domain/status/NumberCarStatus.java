package racingcar.domain.status;

public class NumberCarStatus implements CarStatus {
    private final int number;

    public NumberCarStatus(int number) {
        this.number = number;
    }

    public boolean isForward() {
        return number >= 4;
    }

    public boolean isStop() {
        return !isForward();
    }
}
