package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.status.NumberMoveStatus;

public class CarTest {
    Car car;

    @BeforeEach
    public void before() {
        car = new Car("pobi");
    }

    @Test
    public void 테스트_자동차움직임() {
        Assertions.assertEquals(car.move(NumberMoveStatus.forward()), 1);
        Assertions.assertEquals(car.move(NumberMoveStatus.stop()), 1);
    }

    @Test
    public void 테스트_현재위치표시() {
        car.move(NumberMoveStatus.forward());
        Assertions.assertEquals(car.display(), "pobi : -");
    }
}
