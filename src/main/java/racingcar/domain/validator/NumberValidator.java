package racingcar.domain.validator;

import racingcar.domain.error.Error;

public class NumberValidator {
    public static final String ERROR_NUMBER = Error.msg("횟수는 정수로 입력하세요");

    public static int validate(String number) {
        int result;

        try {
            result = Integer.parseInt(number);
        } catch (Exception e) {
            throw new IllegalArgumentException(ERROR_NUMBER);
        }

        if (result < 0) {
            throw new IllegalArgumentException(ERROR_NUMBER);
        }

        return result;
    }
}
