package racingcar;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Race;
import racingcar.domain.status.NumberCarStatus;

public class RaceTest {
    @Test
    public void 우승자테스트() {
        Cars cars = new Cars(Arrays.asList(
                new Car("pobi"),
                new Car("second")));

        cars.move(NumberCarStatus.forward());

        Assertions.assertEquals("pobi,second", new Race(cars, 5).displayWinners());
    }
}
