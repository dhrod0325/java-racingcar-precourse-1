package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import racingcar.domain.status.MoveStatus;

public class Cars implements Iterable<Car> {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void move(MoveStatus moveStatus) {
        for (Car car : carList) {
            car.move(moveStatus);
        }
    }

    public String display() {
        List<String> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.display());
        }

        return String.join("\n", result);
    }

    public List<Car> sorted() {
        List<Car> result = new ArrayList<>(carList);
        Collections.sort(result);
        
        return result;
    }

    @Override
    public Iterator<Car> iterator() {
        return carList.iterator();
    }
}
