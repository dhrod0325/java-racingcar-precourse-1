package racingcar;

import racingcar.game.controller.GameControllerBuilder;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class Application {
    public static void main(String[] args) {
        new GameControllerBuilder()
                .setInputView(new InputView())
                .setOutputView(new OutputView())
                .build()
                .run();
    }
}
