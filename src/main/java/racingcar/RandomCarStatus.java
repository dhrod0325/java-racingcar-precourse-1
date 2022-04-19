package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomCarStatus implements CarStatus {
    private final int min;
    private final int max;

    public RandomCarStatus(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isForward() {
        return new NumberCarStatus(Randoms.pickNumberInRange(min, max)).isForward();
    }

    @Override
    public boolean isStop() {
        return !isForward();
    }
}
