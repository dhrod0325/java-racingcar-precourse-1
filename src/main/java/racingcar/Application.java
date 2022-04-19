package racingcar;

import racingcar.domain.status.RandomMoveStatus;
import racingcar.game.controller.GameControllerBuilder;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class Application {
    public static void main(String[] args) {
        int RANDOM_CAR_FORWARD_MIN = 0;
        int RANDOM_CAR_FORWARD_MAX = 9;

        new GameControllerBuilder()
                .setInputView(new InputView())
                .setOutputView(new OutputView())
                .setMoveStatus(new RandomMoveStatus(RANDOM_CAR_FORWARD_MIN, RANDOM_CAR_FORWARD_MAX))
                .build()
                .run();
    }
}
