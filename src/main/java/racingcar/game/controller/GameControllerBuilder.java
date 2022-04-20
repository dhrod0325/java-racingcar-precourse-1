package racingcar.game.controller;

import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class GameControllerBuilder {
    private InputView inputView;
    private OutputView outputView;

    public GameControllerBuilder setInputView(InputView inputView) {
        this.inputView = inputView;
        return this;
    }

    public GameControllerBuilder setOutputView(OutputView outputView) {
        this.outputView = outputView;
        return this;
    }

    public GameController build() {
        return new GameController(inputView, outputView);
    }
}
