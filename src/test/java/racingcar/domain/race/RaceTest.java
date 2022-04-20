package racingcar.domain.race;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;
import racingcar.domain.car.engine.CarEngineFactory;
import racingcar.domain.cars.Cars;

public class RaceTest {
    Car pobi;
    Car jun;
    Race race;
    RaceResult raceResult;

    @BeforeEach
    public void before() {
        pobi = new Car("pobi");
        jun = new Car("jun");
        race = new RaceBuilder()
                .setCars(new Cars(Arrays.asList(pobi, jun)))
                .setRaceCount(new RaceCount(5)).build();

        raceResult = race.start(CarEngineFactory.forward());
    }

    @Test
    public void 우승자이름출력테스트1() {
        assertEquals(raceResult.winnerCarsNameList(), Arrays.asList("pobi", "jun"));
    }

    @Test
    public void 우승자이름출력테스트2() {
        pobi.move(CarEngineFactory.forward());

        raceResult = race.start(CarEngineFactory.forward());

        assertEquals(raceResult.winnerCarsNameList(), Collections.singletonList("pobi"));
    }

    @Test
    public void 우승자이름출력테스트실패() {
        pobi.move(CarEngineFactory.forward());
        race.start(CarEngineFactory.forward());

        assertNotEquals(raceResult.winnerCarsNameList(), Collections.singletonList("jun"));
    }
}
