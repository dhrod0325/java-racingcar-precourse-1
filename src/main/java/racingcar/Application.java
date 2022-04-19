package racingcar;

import racingcar.game.controller.GameControllerBuilder;
import racingcar.domain.status.RandomMoveStatus;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class Application {
    public static void main(String[] args) {
        int RANDOM_CAR_MOVE_MIN = 0;
        int RANDOM_CAR_MOVE_MAX = 9;

        // TODO: 프로그램 구현
        new GameControllerBuilder()
                .setInputView(new InputView())
                .setOutputView(new OutputView())
                .setMoveStatus(new RandomMoveStatus(RANDOM_CAR_MOVE_MIN, RANDOM_CAR_MOVE_MAX))
                .build()
                .run();
    }
}
