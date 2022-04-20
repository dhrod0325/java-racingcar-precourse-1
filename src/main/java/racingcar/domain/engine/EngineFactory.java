package racingcar.domain.engine;

public class EngineFactory {
    public static NumberEngine forward() {
        return new NumberEngine(NumberEngine.FORWARD_NUMBER);
    }

    public static NumberEngine stop() {
        return new NumberEngine(NumberEngine.STOP_NUMBER);
    }

    public static Engine random(int min, int max) {
        return new RandomEngine(min, max);
    }
}
