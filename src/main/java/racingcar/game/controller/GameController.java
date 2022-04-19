package racingcar.game.controller;

import racingcar.domain.car.Cars;
import racingcar.domain.car.move.CarMove;
import racingcar.domain.race.Race;
import racingcar.domain.race.RaceCount;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final CarMove moveStatus;

    public GameController(InputView inputView, OutputView outputView, CarMove moveStatus) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.moveStatus = moveStatus;
    }

    public void run() {
        Race race = new Race(getCars(), getRaceCount());
        race.start(moveStatus);

        outputView.display(race.displayCars());
        outputView.displayWinners(race.displayWinners());
    }

    private Cars getCars() {
        try {
            outputView.displayInputCarNames();
            return inputView.getCars();
        } catch (IllegalArgumentException e) {
            outputView.displayError(e);
            return getCars();
        }
    }

    private RaceCount getRaceCount() {
        try {
            outputView.displayInputCount();
            return inputView.getRaceCount();
        } catch (IllegalArgumentException e) {
            outputView.displayError(e);
            return getRaceCount();
        }
    }
}
