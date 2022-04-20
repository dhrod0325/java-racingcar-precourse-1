package racingcar.domain.car.engine;

public class NumberCarEngine implements CarEngine {
    public static final int FORWARD_NUMBER = 4;
    public static final int STOP_NUMBER = 0;

    private final int number;

    public NumberCarEngine(int number) {
        this.number = number;
    }

    public static NumberCarEngine forward() {
        return new NumberCarEngine(FORWARD_NUMBER);
    }

    public static NumberCarEngine stop() {
        return new NumberCarEngine(STOP_NUMBER);
    }

    public boolean isForward() {
        return number >= FORWARD_NUMBER;
    }
}
