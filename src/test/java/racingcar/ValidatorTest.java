package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.domain.Validator;

public class ValidatorTest {
    @Test
    public void 자동차이름길이테스트() {
        Validator.validateCarName("테스트");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateCarName("테스트12345678");
        });
    }

    @Test
    public void 숫자입력테스트() {
        Validator.validateGameCount("1");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Validator.validateGameCount("테스트");
        });
    }
}
