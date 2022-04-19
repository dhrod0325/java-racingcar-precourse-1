package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

public class CarTest {
    Car car;

    @BeforeEach
    public void before() {
        car = new Car("pobi");
    }

    @Test
    public void 테스트_자동차움직임() {
        Assertions.assertEquals(car.move(CarTestUtil.forwardCarStatus()), 1);
        Assertions.assertEquals(car.move(CarTestUtil.stopCarStatus()), 1);
    }

    @Test
    public void 테스트_현재위치표시() {
        car.move(CarTestUtil.forwardCarStatus());
        Assertions.assertEquals(car.display(), "pobi : -");
    }
}
