package racingcar.domain;

public class Validator {
    public static final String ERROR_PREFIX = "[ERROR]";
    public static final String ERROR_CAR_NAME_EMPTY = ERROR_PREFIX + "차 이름은 공백일 수 없습니다.";
    public static final String ERROR_CAR_NAME_OVER_LENGTH = ERROR_PREFIX + "이름의 길이는 %d여야 합니다";
    public static final String ERROR_GAME_COUNT = ERROR_PREFIX + "횟수는 정수로 입력하세요";

    public static final int MAX_CAR_NAME_LENGTH = 5;

    public static void validateCarName(String name) {
        if (name == null) {
            throw new IllegalStateException();
        }

        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_EMPTY);
        }

        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format(ERROR_CAR_NAME_OVER_LENGTH, MAX_CAR_NAME_LENGTH));
        }
    }

    public static int validateRaceCount(String number) {
        int result;

        try {
            result = Integer.parseInt(number);
        } catch (Exception e) {
            throw new IllegalArgumentException(ERROR_GAME_COUNT);
        }

        if (result < 0) {
            throw new IllegalArgumentException(ERROR_GAME_COUNT);
        }

        return result;
    }
}
