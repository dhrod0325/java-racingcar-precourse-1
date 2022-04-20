package racingcar.game.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.cars.Cars;
import racingcar.domain.cars.factory.CarsFactory;
import racingcar.domain.race.RaceRoundCount;

public class InputView {
    public RaceRoundCount getRaceRoundCount() {
        String readLine = Console.readLine();

        return new RaceRoundCount(readLine);
    }

    public Cars getCars() {
        String readLine = Console.readLine();

        return CarsFactory.fromNames(readLine.split(","));
    }
}
