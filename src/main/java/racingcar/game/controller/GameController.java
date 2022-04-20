package racingcar.game.controller;

import racingcar.domain.engine.Engine;
import racingcar.domain.cars.Cars;
import racingcar.domain.race.Race;
import racingcar.domain.race.RaceBuilder;
import racingcar.domain.race.RaceCount;
import racingcar.domain.race.RaceResult;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final Engine engine;

    public GameController(InputView inputView, OutputView outputView, Engine engine) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.engine = engine;
    }

    public void run() {
        Race race = new RaceBuilder()
                .setCars(getCars())
                .setRaceCount(getRaceCount())
                .build();

        RaceResult result = race.start(engine);

        outputView.display(result.displayMonitor());
        outputView.displayWinners(result.winnerNames());
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
