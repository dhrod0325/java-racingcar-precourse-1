package racingcar.domain.status;

public class NumberMoveStatus implements MoveStatus {
    public static final int CHECK_NUMBER = 4;

    private final int number;

    public NumberMoveStatus(int number) {
        this.number = number;
    }

    public boolean isForward() {
        return number >= CHECK_NUMBER;
    }

    public static NumberMoveStatus forward() {
        return new NumberMoveStatus(CHECK_NUMBER);
    }

    public static NumberMoveStatus stop() {
        return new NumberMoveStatus(0);
    }
}
