package racingcar.domain.validator;

public class NumberValidator {
    private final String invalidMessage;

    public NumberValidator(String invalidMessage) {
        this.invalidMessage = invalidMessage;
    }

    public int validate(String number) {
        int result;

        try {
            result = Integer.parseInt(number);
        } catch (Exception e) {
            throw new IllegalArgumentException(invalidMessage);
        }

        if (result < 0) {
            throw new IllegalArgumentException(invalidMessage);
        }

        return result;
    }
}
