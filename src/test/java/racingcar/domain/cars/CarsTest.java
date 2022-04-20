package racingcar.domain.cars;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.move.NumberCarMove;
import racingcar.domain.cars.factory.CarsFactory;

public class CarsTest {
    Car pobi;
    Car jun;
    Cars cars;

    @BeforeEach
    public void before() {
        pobi = new Car("pobi");
        jun = new Car("jun");
        cars = new Cars(Arrays.asList(pobi, jun));
    }

    @Test
    public void 자동차들생성테스트() {
        assertArrayEquals(CarsFactory
                .fromNames(new String[]{"pobi", "jun"})
                .toNames()
                .toArray(), new String[]{"pobi", "jun"});
    }

    @Test
    public void 가장멀리이동한차들() {
        cars.move(NumberCarMove.forward());

        assertArrayEquals(cars
                .filterMaxMoved()
                .toNames()
                .toArray(), new String[]{"pobi", "jun"});

        pobi.move(NumberCarMove.forward());

        assertArrayEquals(cars
                .filterMaxMoved()
                .toNames()
                .toArray(), new String[]{"pobi"});
    }

    @Test
    public void 차움직임테스트() {
        cars.move(NumberCarMove.forward());

        for (Car car : cars.toList()) {
            assertEquals(car.getPosition().get(), 1);
        }
    }
}
