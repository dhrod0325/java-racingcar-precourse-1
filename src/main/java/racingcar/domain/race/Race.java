package racingcar.domain.race;

import racingcar.domain.engine.Engine;
import racingcar.domain.cars.Cars;

public class Race {
    private final Cars cars;
    private final RaceCount raceCount;

    public Race(Cars cars, RaceCount raceCount) {
        this.raceCount = raceCount;
        this.cars = cars;
    }

    public RaceResult start(Engine engine) {
        RaceResult result = new RaceResult(cars);

        for (int i = 0; i < raceCount.get(); i++) {
            cars.move(engine);
            result.addMonitor(cars.toString());
        }

        return result;
    }
}
