package racingcar.game.controller;

import racingcar.domain.Cars;
import racingcar.domain.Race;
import racingcar.domain.RaceCount;
import racingcar.domain.status.MoveStatus;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final MoveStatus moveStatus;

    public GameController(InputView inputView, OutputView outputView, MoveStatus moveStatus) {
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
