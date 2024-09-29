package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class Scattershot extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 3600),
                entry(2, 4200),
                entry(3, 4800),
                entry(4, 5100),
                entry(5, 5410)
        );
    }

    public int getMaxTier() {
        return 5;
    }
}
