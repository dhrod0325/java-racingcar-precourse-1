package racingcar.domain.car.engine;

public class NumberCarEngine implements CarEngine {
    public static final int FORWARD_NUMBER = 4;
    public static final int STOP_NUMBER = 0;

    private final int number;

    public NumberCarEngine(int number) {
        this.number = number;
    }

    public boolean isForward() {
        return number >= FORWARD_NUMBER;
    }
}
