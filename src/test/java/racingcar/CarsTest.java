package racingcar;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.status.NumberMoveStatus;

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
        Assertions.assertArrayEquals(Cars
                .fromNames(new String[]{"pobi", "jun"})
                .getNames()
                .toArray(), new String[]{"pobi", "jun"});
    }

    @Test
    public void 가장멀리이동한차들() {
        cars.move(NumberMoveStatus.forward());

        Assertions.assertArrayEquals(cars
                .getMaximumPositionCars()
                .getNames()
                .toArray(), new String[]{"pobi", "jun"});

        pobi.move(NumberMoveStatus.forward());

        Assertions.assertArrayEquals(cars
                .getMaximumPositionCars()
                .getNames()
                .toArray(), new String[]{"pobi"});
    }

    @Test
    public void 차움직임테스트() {
        cars.move(NumberMoveStatus.forward());

        for (Car car : cars) {
            Assertions.assertEquals(car.getPosition(), 1);
        }
    }
}
