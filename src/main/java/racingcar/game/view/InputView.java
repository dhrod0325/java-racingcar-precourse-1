package racingcar.game.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.RaceCount;

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
