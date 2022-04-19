package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.Race;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

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
        outputView.display(race.start());
        outputView.displayWinners(race.displayWinners());
    }
}
