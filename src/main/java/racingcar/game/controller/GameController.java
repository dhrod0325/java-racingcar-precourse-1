package racingcar.game.controller;

import racingcar.domain.cars.Cars;
import racingcar.domain.engine.EngineFactory;
import racingcar.domain.race.Race;
import racingcar.domain.race.RaceBuilder;
import racingcar.domain.race.RaceCount;
import racingcar.domain.race.RaceMonitor;
import racingcar.domain.race.RaceResult;
import racingcar.game.view.InputView;
import racingcar.game.view.OutputView;

public class GameController {
    private static final int RANDOM_CAR_FORWARD_MIN = 0;
    private static final int RANDOM_CAR_FORWARD_MAX = 9;

    private final InputView inputView;
    private final OutputView outputView;

    public GameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        Race race = new RaceBuilder()
                .setCars(getCars())
                .setRaceCount(getRaceCount())
                .setRaceMonitor(new RaceMonitor())
                .setRaceEngine(EngineFactory.random(RANDOM_CAR_FORWARD_MIN, RANDOM_CAR_FORWARD_MAX))
                .build();

        RaceResult result = race.start();

        outputView.display(race.monitor());
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
