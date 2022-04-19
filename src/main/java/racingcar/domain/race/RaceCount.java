package racingcar.domain.race;

import racingcar.domain.Error;
import racingcar.domain.validator.NumberValidator;

public class RaceCount {
    public static final String ERROR_GAME_COUNT = Error.msg("횟수는 정수로 입력하세요");

    private final int raceCount;

    public RaceCount(String raceCount) {
        this.raceCount = new NumberValidator(ERROR_GAME_COUNT).validate(raceCount);
    }

    public RaceCount(int raceCount) {
        this(raceCount + "");
    }

    public int get() {
        return raceCount;
    }
}
