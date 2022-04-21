package racingcar.domain.race;

import racingcar.domain.validator.NumberValidator;

public class RaceRoundCount {
    private final int roundCount;

    public RaceRoundCount(String roundCount) {
        NumberValidator.validate(roundCount);
        
        this.roundCount = Integer.parseInt(roundCount);
    }

    public RaceRoundCount(int roundCount) {
        this(roundCount + "");
    }

    public int get() {
        return roundCount;
    }
}
