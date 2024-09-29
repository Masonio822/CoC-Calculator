package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class MultiArcherTower extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 5000),
                entry(2, 5200)
        );
    }

    public int getMaxTier() {
        return 2;
    }
}
