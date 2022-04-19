package racingcar.game.controller;

import racingcar.domain.car.move.CarMove;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class GameControllerBuilder {
    private InputView inputView;
    private OutputView outputView;
    private CarMove carMove;

    public GameControllerBuilder setInputView(InputView inputView) {
        this.inputView = inputView;
        return this;
    }

    public GameControllerBuilder setOutputView(OutputView outputView) {
        this.outputView = outputView;
        return this;
    }

    public GameControllerBuilder setCarMove(CarMove carMove) {
        this.carMove = carMove;
        return this;
    }

    public GameController build() {
        return new GameController(inputView, outputView, carMove);
    }
}
