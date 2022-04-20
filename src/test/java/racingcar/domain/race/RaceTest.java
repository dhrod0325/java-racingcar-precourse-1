package racingcar.domain.race;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
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
    RaceResult raceResult;

    @BeforeEach
    public void before() {
        pobi = new Car("pobi");
        jun = new Car("jun");
        cars = new Cars(Arrays.asList(pobi, jun));

        race = new RaceBuilder().setCars(cars).setRaceCount(new RaceCount(5)).build();
    }

    @Test
    public void 우승자이름출력테스트1() {
        raceResult = race.start(NumberCarMove.forward());
        assertTrue(raceResult.toString().contains("최종 우승자는 pobi,jun 입니다."));
    }

    @Test
    public void 우승자이름출력테스트2() {
        pobi.move(NumberCarMove.forward());
        raceResult = race.start(NumberCarMove.forward());
        assertTrue(raceResult.toString().contains("최종 우승자는 pobi 입니다."));
    }

    @Test
    public void 우승자이름출력테스트실패() {
        pobi.move(NumberCarMove.forward());
        raceResult = race.start(NumberCarMove.forward());
        assertFalse(raceResult.toString().contains("최종 우승자는 jun 입니다."));
    }
}
