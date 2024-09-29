package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class BuilderHut extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 250),
                entry(2, 1000),
                entry(3, 1300),
                entry(4, 1600),
                entry(5, 1800),
                entry(6, 1900)
        );
    }

    public int getMaxTier() {
        return 6;
    }
}
