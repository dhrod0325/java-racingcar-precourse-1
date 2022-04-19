package racingcar;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsTest {
    Car pobi;
    Car jun;
    Cars cars;

    @BeforeEach
    public void before() {
        pobi = new Car("pobi");
        pobi.setCarStatus(CarTestUtil.forwardCarStatus());
        jun = new Car("jun");
        jun.setCarStatus(CarTestUtil.forwardCarStatus());
        cars = new Cars(Arrays.asList(pobi, jun));
    }

    @Test
    public void 차움직임테스트() {
        List<Car> movedCarList = cars.move();
        for (Car car : movedCarList) {
            Assertions.assertTrue(car.isCurrentPosition(1));
        }
    }

    @Test
    public void 우승자테스트() {
        cars.move();
        Assertions.assertTrue(cars.winners().containsAll(Arrays.asList(pobi, jun)));

        jun.setCarStatus(CarTestUtil.stopCarStatus());
        cars.move();

        Assertions.assertFalse(cars.winners().contains(jun));
    }
}
