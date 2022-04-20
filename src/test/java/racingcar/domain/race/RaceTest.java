package racingcar.domain.race;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.car.Car;
import racingcar.domain.cars.Cars;
import racingcar.domain.engine.EngineFactory;

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
                .setRaceMonitor(new RaceMonitor())
                .setRaceEngine(EngineFactory.forward())
                .setRaceRoundCount(new RaceRoundCount(5)).build();

        raceResult = race.start();
    }

    @Test
    public void 우승자이름출력테스트1() {
        assertEquals(raceResult.winnerCarsNameList(), Arrays.asList("pobi", "jun"));
    }

    @Test
    public void 우승자이름출력테스트2() {
        pobi.move(EngineFactory.forward());

        assertEquals(raceResult.winnerCarsNameList(), Collections.singletonList("pobi"));
    }

    @Test
    public void 우승자이름출력테스트실패() {
        pobi.move(EngineFactory.forward());
        race.start();

        assertNotEquals(raceResult.winnerCarsNameList(), Collections.singletonList("jun"));
    }
}
