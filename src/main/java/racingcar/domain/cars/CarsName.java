package racingcar.domain.cars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.domain.car.Car;
import racingcar.domain.car.CarName;

public class CarsName {
    public static final String MSG_INVALID_NAME = "같은 이름의 차를 만들 수 없습니다.";

    private final List<Car> carList;

    public CarsName(List<Car> carList) {
        this.carList = carList;

        validate();
    }

    public void validate() {
        if (toSet().size() != carList.size()) {
            throw new IllegalStateException(MSG_INVALID_NAME);
        }
    }

    public List<CarName> getNames() {
        List<CarName> result = new ArrayList<>();

        for (Car car : carList) {
            result.add(car.getCarName());
        }

        return result;
    }

    public List<String> toList() {
        List<String> result = new ArrayList<>();

        for (CarName carName : getNames()) {
            result.add(carName.get());
        }

        return result;
    }

    public Set<String> toSet() {
        return new HashSet<>(toList());
    }

    public String[] toArray() {
        return toList().toArray(new String[0]);
    }
}
