package racingcar.domain.cars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.domain.cars.factory.CarsFactory;

public class CarNamesTest {
    @Test
    public void 차이름중복테스트() {
        Assertions.assertThrows(IllegalStateException.class, () -> CarsFactory.fromNames("pobi,pobi".split(",")));
    }
}
