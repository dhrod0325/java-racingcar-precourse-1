package racingcar.domain.car;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarNameTest {
    @ParameterizedTest
    @ValueSource(strings = {"테스트", "pobi", "hello", "world"})
    public void 자동차입력검증(String name) {
        new CarName(name);
    }

    @ParameterizedTest
    @ValueSource(strings = {"테스트12345", "  "})
    public void 자동차입력검증실패(String name) {
        assertThrows(IllegalArgumentException.class, () -> new CarName(name));
    }
}
