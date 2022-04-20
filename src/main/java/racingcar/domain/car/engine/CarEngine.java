package racingcar.domain.car.engine;

public interface CarEngine {
    static CarEngine forward() {
        return NumberCarEngine.forward();
    }

    static CarEngine stop() {
        return NumberCarEngine.stop();
    }

    static CarEngine random(int min, int max) {
        return new RandomCarEngine(min, max);
    }

    boolean isForward();
}
