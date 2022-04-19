package racingcar.domain.car;

import racingcar.domain.validator.CarNameValidator;

public class CarName {
    private final String name;

    public CarName(String name) {
        this.name = new CarNameValidator().validate(name);
    }

    public String get() {
        return name;
    }
}
