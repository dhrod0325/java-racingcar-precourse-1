package racingcar.domain.engine;

public class NumberEngine implements Engine {
    public static final int FORWARD_NUMBER = 4;
    public static final int STOP_NUMBER = 0;

    private final int number;

    public NumberEngine(int number) {
        this.number = number;
    }

    public boolean isForward() {
        return number >= FORWARD_NUMBER;
    }
}
