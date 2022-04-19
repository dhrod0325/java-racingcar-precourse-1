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
        car.setCarStatus(CarTestUtil.forwardCarStatus());
        Assertions.assertEquals(car.move(), 1);

        car.setCarStatus(CarTestUtil.stopCarStatus());
        Assertions.assertEquals(car.move(), 1);
    }

    @Test
    public void 테스트_현재위치표시() {
        car.setCarStatus(CarTestUtil.forwardCarStatus());
        car.move();
        Assertions.assertEquals(car.display(), "pobi : -");
    }
}
