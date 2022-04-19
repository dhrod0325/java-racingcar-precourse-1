package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    private int winnerPosition = 0;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void setCarStatus(CarStatus carStatus) {
        for (Car car : carList) {
            car.setCarStatus(carStatus);
        }
    }

    public List<Car> move() {
        for (Car car : carList) {
            int moved = car.move();
            setWinnerPosition(moved);
        }

        return carList;
    }

    public String displayWinners() {
        return String.join(",", winnerNames());
    }

    public void display() {
        for (Car car : carList) {
            System.out.println(car.display());
        }
    }

    private List<String> winnerNames() {
        List<String> result = new ArrayList<>();
        List<Car> winners = winners();
        for (Car car : winners) {
            result.add(car.getName());
        }

        return result;
    }

    private List<Car> winners() {
        List<Car> result = new ArrayList<>();

        for (Car car : carList) {
            addWinner(result, car);
        }

        return result;
    }

    private void addWinner(List<Car> result, Car car) {
        if (isWinner(car)) {
            result.add(car);
        }
    }

    private boolean isWinner(Car car) {
        return car.isCurrentPosition(winnerPosition);
    }

    private void setWinnerPosition(int moved) {
        if (moved > winnerPosition) {
            winnerPosition = moved;
        }
    }
}
