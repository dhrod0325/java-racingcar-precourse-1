package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.Race;
import racingcar.domain.status.MoveStatus;
import racingcar.view.InputView;
import racingcar.view.OutputView;

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
        displayResult(new Race(getCars(), getGameCount()));
    }

    private Cars getCars() {
        try {
            outputView.displayInputCarNames();
            return inputView.getCars();
        } catch (IllegalArgumentException e) {
            outputView.display(e.getMessage());
            return getCars();
        }
    }

    private int getGameCount() {
        try {
            outputView.displayInputCount();
            return inputView.getGameCount();
        } catch (IllegalArgumentException e) {
            outputView.display(e.getMessage());
            return getGameCount();
        }
    }

    private void displayResult(Race race) {
        outputView.display(race.start(moveStatus));
        outputView.displayWinners(race.displayWinners());
    }
}
