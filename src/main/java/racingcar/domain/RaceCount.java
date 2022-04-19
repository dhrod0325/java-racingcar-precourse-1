package racingcar.domain;

public class RaceCount {
    private final int raceCount;

    public RaceCount(String raceCount) {
        this.raceCount = Validator.validateRaceCount(raceCount);
    }

    public RaceCount(int raceCount) {
        this(raceCount + "");
    }

    public int get() {
        return raceCount;
    }
}
