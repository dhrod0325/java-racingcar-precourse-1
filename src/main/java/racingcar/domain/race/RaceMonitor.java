package racingcar.domain.race;

import java.util.ArrayList;
import java.util.List;

public class RaceMonitor {
    private final List<String> result = new ArrayList<>();

    public void add(String status) {
        result.add(status);
    }

    public void clear() {
        result.clear();
    }

    public String display() {
        return String.join("\n\n", result);
    }
}
