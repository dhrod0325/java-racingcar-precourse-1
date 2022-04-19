package racingcar.domain.car;

import racingcar.domain.validator.NameValidator;

public class CarName {
    private final String name;

    public CarName(String name) {
        this.name = new NameValidator().validate(name);
    }

    public String get() {
        return name;
    }
}
