package racingcar;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.Race;
import racingcar.domain.status.NumberMoveStatus;

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
        race = new Race(cars, 5);
    }

    @Test
    public void 우승자이름출력테스트1() {
        cars.move(NumberMoveStatus.forward());
        
        Assertions.assertEquals("pobi,jun", race.displayWinners());
    }

    @Test
    public void 우승자이름출력테스트2() {
        pobi.move(NumberMoveStatus.forward());

        Assertions.assertEquals("pobi", race.displayWinners());
    }

    @Test
    public void 우승자이름출력테스트실패() {
        pobi.move(NumberMoveStatus.forward());

        Assertions.assertNotEquals("jun", race.displayWinners());
    }
}
