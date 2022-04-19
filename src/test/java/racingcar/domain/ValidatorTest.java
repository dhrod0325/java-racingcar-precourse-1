package racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.Validator;

public class ValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"테스트", "pobi", "hello", "world"})
    public void 자동차입력검증(String name) {
        Validator.validateCarName(name);
    }

    @ParameterizedTest
    @ValueSource(strings = {"테스트12345", "  "})
    public void 자동차입력검증실패(String name) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Validator.validateCarName(name));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    public void 숫자입력검증(int count) {
        Validator.validateRaceCount(String.valueOf(count));
    }

    @ParameterizedTest
    @ValueSource(strings = {"테스트12345", ""})
    public void 숫자입력실패(String name) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Validator.validateRaceCount(name));
    }
}
