package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomCarStatus implements CarStatus {
    @Override
    public boolean isForward() {
        return new NumberCarStatus(Randoms.pickNumberInRange(0, 9)).isForward();
    }

    @Override
    public boolean isStop() {
        return false;
    }
}
