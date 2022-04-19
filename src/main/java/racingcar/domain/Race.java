package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.status.RandomCarStatus;

public class Race {
    private final Cars cars;
    private final int gameCount;

    public Race(Cars cars, int gameCount) {
        this.gameCount = gameCount;
        this.cars = cars;
    }

    public String start() {
        for (int i = 0; i < gameCount; i++) {
            cars.move(new RandomCarStatus(0, 9));
        }

        return cars.display();
    }

    public String displayWinners() {
        return String.join(",", winnerNames());
    }

    private List<String> winnerNames() {
        List<String> result = new ArrayList<>();
        Cars winners = winners();

        for (Car car : winners) {
            result.add(car.getName());
        }

        return result;
    }

    private Cars winners() {
        return cars.getOverPositionCars(getWinnerPosition());
    }

    private int getWinnerPosition() {
        List<Car> result = cars.sorted();

        if (result.isEmpty()) {
            return 0;
        }

        return result.get(0).getPosition();
    }
}
