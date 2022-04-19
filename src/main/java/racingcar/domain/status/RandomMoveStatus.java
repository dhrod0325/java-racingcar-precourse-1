package racingcar.domain.status;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMoveStatus implements MoveStatus {
    private final int min;
    private final int max;

    public RandomMoveStatus(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isForward() {
        return new NumberMoveStatus(Randoms.pickNumberInRange(min, max))
                .isForward();
    }
}
