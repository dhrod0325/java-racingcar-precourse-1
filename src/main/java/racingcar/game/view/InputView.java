package racingcar.game.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.car.Cars;
import racingcar.domain.race.RaceCount;

public class InputView {
    public RaceCount getRaceCount() {
        String readLine = Console.readLine();

        return new RaceCount(readLine);
    }

    public Cars getCars() {
        String readLine = Console.readLine();
        
        return Cars.fromNames(readLine.split(","));
    }
}
