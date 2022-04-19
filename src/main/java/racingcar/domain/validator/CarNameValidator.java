package racingcar.domain.validator;

import racingcar.domain.error.Error;

public class CarNameValidator {
    public static final int MAX_CAR_NAME_LENGTH = 5;

    public static final String ERROR_CAR_NAME_EMPTY = Error.msg("차 이름은 공백일 수 없습니다.");
    public static final String ERROR_CAR_NAME_OVER_LENGTH = Error.msg("차 이름의 길이는 %d여야 합니다.");
    
    public String validate(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_EMPTY);
        }

        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format(ERROR_CAR_NAME_OVER_LENGTH, MAX_CAR_NAME_LENGTH));
        }

        return name;
    }
}
