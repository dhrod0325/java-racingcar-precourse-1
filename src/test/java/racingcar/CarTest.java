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
    public void 테스트_자동차움직임() {
        car.setCarStatus(new NumberCarStatus(4));
        Assertions.assertEquals(car.move(), 1);

        car.setCarStatus(new NumberCarStatus(3));
        Assertions.assertEquals(car.move(), 1);
    }

    @Test
    public void 테스트_현재위치표시() {
        car.setCarStatus(new NumberCarStatus(4));
        car.move();
        Assertions.assertEquals(car.display(), "pobi : -");
    }
}
