package racingcar;

import racingcar.domain.engine.EngineFactory;
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
                .setCarEngine(EngineFactory.random(RANDOM_CAR_FORWARD_MIN, RANDOM_CAR_FORWARD_MAX))
                .build()
                .run();
    }
}
