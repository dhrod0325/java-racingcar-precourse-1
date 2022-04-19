package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    Car car;

    @BeforeEach
    public void before() {
        car = new Car("pobi");
    }

    @Test
    public void 테스트_자동차상태테스트() {
        car.setState(4);
        Assertions.assertTrue(car.isForward());

        car.setState(3);
        Assertions.assertTrue(car.isStop());
    }

    @Test
    public void 테스트_자동차움직임() {
        car.setState(4);
        Assertions.assertEquals(car.move(), 1);

        car.setState(3);
        Assertions.assertEquals(car.move(), 1);
    }
}
