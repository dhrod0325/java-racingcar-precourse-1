package racingcar.domain.race;

import java.util.ArrayList;
import java.util.List;

public class RaceResult {
    public static final String MSG_WINNERS = "최종 우승자는 %s 입니다.";

    private final List<String> result = new ArrayList<>();

    public void addResult(String display) {
        result.add(display);
    }

    public void addResultWinners(List<String> names) {
        result.add(String.format(MSG_WINNERS, String.join(",", names)));
    }

    public void clear() {
        result.clear();
    }

    @Override
    public String toString() {
        return String.join("\n\n", result);
    }
}
