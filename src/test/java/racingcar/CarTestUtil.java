package racingcar;

public class CarTestUtil {
    public static CarStatus forwardCarStatus() {
        return new NumberCarStatus(4);
    }

    public static CarStatus stopCarStatus() {
        return new NumberCarStatus(3);
    }
}
