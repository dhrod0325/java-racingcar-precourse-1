package racingcar.domain.validator;

import racingcar.domain.error.Error;

public class NumberValidator {
    public static final String MSG_ERROR_NUMBER = Error.msg("횟수는 정수로 입력하세요");

    public static void validate(String number) {
        validateNumber(number);
    }

    private static void validateNumber(String number) {
        int result;

        try {
            result = Integer.parseInt(number);
        } catch (Exception e) {
            throw new IllegalArgumentException(MSG_ERROR_NUMBER);
        }

        if (result < 0) {
            throw new IllegalArgumentException(MSG_ERROR_NUMBER);
        }
    }
}
