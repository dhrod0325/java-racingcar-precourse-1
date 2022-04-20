package racingcar.domain.validator;

import java.util.List;
import racingcar.domain.car.Car;

public class CarsValidator {
    public static final String MSG_INVALID_NAME = "같은 이름의 차를 만들 수 없습니다.";

    public static void validate(List<Car> carList, Car car) {
        if (carList.contains(car)) {
            throw new IllegalStateException(MSG_INVALID_NAME);
        }
    }
}
