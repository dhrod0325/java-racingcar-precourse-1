package racingcar.domain.race;

import racingcar.domain.validator.NumberValidator;

public class RaceCount {
    private final int raceCount;

    public RaceCount(String raceCount) {
        this.raceCount = NumberValidator.validate(raceCount);
    }

    public RaceCount(int raceCount) {
        this(raceCount + "");
    }

    public int get() {
        return raceCount;
    }
}
