package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class SpellTower extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 2500),
                entry(2, 2800),
                entry(3, 3100)
        );
    }

    public int getMaxTier() {
        return 3;
    }
}
