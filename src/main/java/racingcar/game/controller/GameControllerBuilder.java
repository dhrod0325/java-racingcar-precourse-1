package racingcar.game.controller;

import racingcar.domain.car.engine.CarEngine;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class GameControllerBuilder {
    private InputView inputView;
    private OutputView outputView;
    private CarEngine carEngine;

    public GameControllerBuilder setInputView(InputView inputView) {
        this.inputView = inputView;
        return this;
    }

    public GameControllerBuilder setOutputView(OutputView outputView) {
        this.outputView = outputView;
        return this;
    }

    public GameControllerBuilder setCarEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
        return this;
    }

    public GameController build() {
        return new GameController(inputView, outputView, carEngine);
    }
}
