package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class Monolith extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 4747),
                entry(2, 5050),
                entry(3, 5353)
        );
    }

    public int getMaxTier() {
        return 3;
    }
}
