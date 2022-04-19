package racingcar.domain.status;

public class NumberMoveStatus implements MoveStatus {
    public static final int FORWARD_NUMBER = 4;
    public static final int STOP_NUMBER = 0;

    private final int number;

    public NumberMoveStatus(int number) {
        this.number = number;
    }

    public boolean isForward() {
        return number >= FORWARD_NUMBER;
    }

    public static NumberMoveStatus forward() {
        return new NumberMoveStatus(FORWARD_NUMBER);
    }

    public static NumberMoveStatus stop() {
        return new NumberMoveStatus(STOP_NUMBER);
    }
}
