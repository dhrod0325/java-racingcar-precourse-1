package racingcar.domain.car;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.engine.EngineFactory;

public class CarTest {
    Car car;

    @BeforeEach
    public void before() {
        car = new Car("pobi");
    }

    @Test
    public void 테스트_자동차움직임() {
        car.move(EngineFactory.forward());
        assertEquals(car.getPosition().get(), 1);

        car.move(EngineFactory.forward());
        assertEquals(car.getPosition().get(), 2);

        car.move(EngineFactory.forward());
        assertEquals(car.getPosition().get(), 3);

        car.move(EngineFactory.stop());
        assertEquals(car.getPosition().get(), 3);
    }

    @Test
    public void 테스트_현재위치표시() {
        car.move(EngineFactory.forward());
        assertEquals(car.toString(), "pobi : -");

        car.move(EngineFactory.forward());
        assertEquals(car.toString(), "pobi : --");

        car.move(EngineFactory.stop());
        assertEquals(car.toString(), "pobi : --");
    }
}
