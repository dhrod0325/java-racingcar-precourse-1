package racingcar.domain.car;

import racingcar.domain.validator.NameValidator;

public class CarName {
    private final String name;

    public CarName(String name) {
        NameValidator.validate(name);

        this.name = name;
    }

    public String get() {
        return name;
    }
}
