package racingcar.domain.car.engine;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomCarEngine implements CarEngine {
    private final int min;
    private final int max;

    public RandomCarEngine(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isForward() {
        return new NumberCarEngine(Randoms.pickNumberInRange(min, max))
                .isForward();
    }
}
