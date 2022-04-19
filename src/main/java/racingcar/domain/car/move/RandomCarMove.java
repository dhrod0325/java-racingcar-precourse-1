package racingcar.domain.car.move;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomCarMove implements CarMove {
    private final int min;
    private final int max;

    public RandomCarMove(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isForward() {
        return new NumberCarMove(Randoms.pickNumberInRange(min, max))
                .isForward();
    }
}
