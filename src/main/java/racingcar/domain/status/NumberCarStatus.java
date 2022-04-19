package racingcar.domain.status;

public class NumberCarStatus implements CarStatus {
    public static final int CHECK_NUMBER = 4;

    private final int number;

    public NumberCarStatus(int number) {
        this.number = number;
    }

    public boolean isForward() {
        return number >= CHECK_NUMBER;
    }

    public static NumberCarStatus forward() {
        return new NumberCarStatus(CHECK_NUMBER);
    }

    public static NumberCarStatus stop() {
        return new NumberCarStatus(0);
    }
}
