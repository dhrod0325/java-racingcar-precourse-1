package racingcar.domain.race;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;
import racingcar.domain.race.Race;
import racingcar.domain.race.RaceCount;
import racingcar.domain.car.move.NumberCarMove;

public class RaceTest {
    Car pobi;
    Car jun;
    Cars cars;
    Race race;

    @BeforeEach
    public void before() {
        pobi = new Car("pobi");
        jun = new Car("jun");
        cars = new Cars(Arrays.asList(pobi, jun));
        race = new Race(cars, new RaceCount(5));
    }

    @Test
    public void 우승자이름출력테스트1() {
        cars.move(NumberCarMove.forward());

        Assertions.assertEquals("pobi,jun", race.displayWinners());
    }

    @Test
    public void 우승자이름출력테스트2() {
        pobi.move(NumberCarMove.forward());

        Assertions.assertEquals("pobi", race.displayWinners());
    }

    @Test
    public void 우승자이름출력테스트실패() {
        pobi.move(NumberCarMove.forward());

        Assertions.assertNotEquals("jun", race.displayWinners());
    }
}
