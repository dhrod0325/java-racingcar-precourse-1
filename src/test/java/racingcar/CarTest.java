package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void 테스트_자동차상태테스트() {
        Car car = new Car();
        car.setState(4);
        Assertions.assertTrue(car.isForward());

        car.setState(3);
        Assertions.assertTrue(car.isStop());
    }
}
