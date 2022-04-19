package racingcar.domain.car;

import racingcar.domain.Error;

public class CarName {
    public static final int MAX_CAR_NAME_LENGTH = 5;

    public static final String ERROR_CAR_NAME_EMPTY = Error.msg("차 이름은 공백일 수 없습니다.");
    public static final String ERROR_CAR_NAME_OVER_LENGTH = Error.msg("이름의 길이는 %d여야 합니다.");

    private final String name;

    public CarName(String name) {
        this.name = validate(name);
    }

    public String get() {
        return name;
    }

    private String validate(String name) {
        if (name == null) {
            throw new IllegalStateException();
        }

        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_EMPTY);
        }

        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format(ERROR_CAR_NAME_OVER_LENGTH, MAX_CAR_NAME_LENGTH));
        }

        return name;
    }
}
