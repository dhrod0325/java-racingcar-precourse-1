package racingcar.domain.car.engine;

import static racingcar.domain.car.engine.NumberCarEngine.FORWARD_NUMBER;
import static racingcar.domain.car.engine.NumberCarEngine.STOP_NUMBER;

public class CarEngineFactory {
    public static NumberCarEngine forward() {
        return new NumberCarEngine(FORWARD_NUMBER);
    }

    public static NumberCarEngine stop() {
        return new NumberCarEngine(STOP_NUMBER);
    }

    public static CarEngine random(int min, int max) {
        return new RandomCarEngine(min, max);
    }
}
