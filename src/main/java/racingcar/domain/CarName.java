package racingcar.domain;

public class CarName {
    private final String name;

    public CarName(String name) {
        this.name = name;
        Validator.validateCarName(name);
    }

    public String get() {
        return name;
    }
}
