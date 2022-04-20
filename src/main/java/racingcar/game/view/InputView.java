package racingcar.game.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.cars.Cars;
import racingcar.domain.cars.factory.CarsFactory;
import racingcar.domain.race.RaceCount;

public class InputView {
    public RaceCount getRaceCount() {
        String readLine = Console.readLine();

        return new RaceCount(readLine);
    }

    public Cars getCars() {
        String readLine = Console.readLine();

        return CarsFactory.fromNames(readLine.split(","));
    }
}
