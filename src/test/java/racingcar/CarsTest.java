package racingcar;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;

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
    public void 차움직임테스트() {
        cars.move(CarTestUtil.forwardCarStatus());

        for (Car car : cars) {
            Assertions.assertEquals(car.getPosition(), 1);
        }
    }

//    @Test
//    public void 우승자테스트() {
//        cars.move();
//        Assertions.assertTrue(cars.displayWinners().contains("pobi,jun"));
//
//        jun.setCarStatus(CarTestUtil.stopCarStatus());
//
//        cars.move();
//        Assertions.assertFalse(cars.displayWinners().contains("jun"));
//    }
}
