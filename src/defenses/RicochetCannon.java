package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class RicochetCannon extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 5400),
                entry(2, 5700)
        );
    }

    public int getMaxTier() {
        return 2;
    }
}
