package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Validator;

public class InputView {
    public int getGameCount() {
        return Validator.validateGameCount(Console.readLine());
    }

    public Cars getCars() {
        String[] carNames = Console.readLine().split(",");

        List<Car> carList = new ArrayList<>();

        for (String carName : carNames) {
            carList.add(new Car(Validator.validateCarName(carName)));
        }

        return new Cars(carList);
    }
}
