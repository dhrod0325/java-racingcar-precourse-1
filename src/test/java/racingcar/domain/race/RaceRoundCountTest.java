package racingcar.domain.race;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RaceRoundCountTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    public void 숫자입력검증(int count) {
        new RaceRoundCount(count);
    }

    @ParameterizedTest
    @ValueSource(strings = {"테스트12345", ""})
    public void 숫자입력실패(String count) {
        assertThrows(IllegalArgumentException.class, () -> new RaceRoundCount(count));
    }
}
