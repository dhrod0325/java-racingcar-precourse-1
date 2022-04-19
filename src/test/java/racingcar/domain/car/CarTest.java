package racingcar.domain.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.move.NumberCarMove;

public class CarTest {
    Car car;

    @BeforeEach
    public void before() {
        car = new Car("pobi");
    }

    @Test
    public void 테스트_자동차움직임() {
        Assertions.assertEquals(car.move(NumberCarMove.forward()), 1);
        Assertions.assertEquals(car.move(NumberCarMove.stop()), 1);
        Assertions.assertEquals(car.move(NumberCarMove.forward()), 2);
        Assertions.assertEquals(car.move(NumberCarMove.forward()), 3);
    }

    @Test
    public void 테스트_현재위치표시() {
        car.move(NumberCarMove.forward());
        Assertions.assertEquals(car.display(), "pobi : -");

        car.move(NumberCarMove.forward());
        Assertions.assertEquals(car.display(), "pobi : --");

        car.move(NumberCarMove.stop());
        Assertions.assertEquals(car.display(), "pobi : --");
    }
}
