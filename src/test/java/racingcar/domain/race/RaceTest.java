package racingcar.domain.race;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.move.NumberCarMove;
import racingcar.domain.cars.Cars;

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

        race = new RaceBuilder()
                .setCars(cars)
                .setRaceCount(new RaceCount(5)).build();
    }

    @Test
    public void 우승자이름출력테스트1() {
        race.start(NumberCarMove.forward());

        assertEquals(race.winnerCarsNameList(), Arrays.asList("pobi", "jun"));
    }

    @Test
    public void 우승자이름출력테스트2() {
        pobi.move(NumberCarMove.forward());
        race.start(NumberCarMove.forward());

        assertEquals(race.winnerCarsNameList(), Collections.singletonList("pobi"));
    }

    @Test
    public void 우승자이름출력테스트실패() {
        pobi.move(NumberCarMove.forward());
        race.start(NumberCarMove.forward());

        assertNotEquals(race.winnerCarsNameList(), Collections.singletonList("jun"));
    }
}
