package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.Validator;

public class InputView {
    public int getGameCount() {
        String readLine = Console.readLine();
        return Validator.validateGameCount(readLine);
    }

    public Cars getCars() {
        String readLine = Console.readLine();
        return Cars.fromNames(Validator.validateCarNames(readLine.split(",")));
    }
}
