package racingcar.domain.engine;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomEngine implements Engine {
    private final int min;
    private final int max;

    public RandomEngine(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isForward() {
        return new NumberEngine(Randoms.pickNumberInRange(min, max))
                .isForward();
    }
}
