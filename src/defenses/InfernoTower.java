package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class InfernoTower extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 1500),
                entry(2, 1800),
                entry(3, 2100),
                entry(4, 2400),
                entry(5, 2700),
                entry(6, 3000),
                entry(7, 3300),
                entry(8, 3700),
                entry(9, 4100),
                entry(10, 4400)
        );
    }
    public int getMaxTier() {
        return 10;
    }
}
