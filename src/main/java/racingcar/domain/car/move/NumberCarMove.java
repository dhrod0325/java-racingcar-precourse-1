package racingcar.domain.car.move;

public class NumberCarMove implements CarMove {
    public static final int FORWARD_NUMBER = 4;
    public static final int STOP_NUMBER = 0;

    private final int number;

    public NumberCarMove(int number) {
        this.number = number;
    }

    public boolean isForward() {
        return number >= FORWARD_NUMBER;
    }

    public static NumberCarMove forward() {
        return new NumberCarMove(FORWARD_NUMBER);
    }

    public static NumberCarMove stop() {
        return new NumberCarMove(STOP_NUMBER);
    }
}
