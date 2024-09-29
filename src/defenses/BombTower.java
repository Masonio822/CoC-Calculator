package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class BombTower extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 650),
                entry(2, 700),
                entry(3, 750),
                entry(4, 850),
                entry(5, 1050),
                entry(6, 1300),
                entry(7, 1600),
                entry(8, 1900),
                entry(9, 2300),
                entry(10, 2500),
                entry(11, 2700)
        );
    }
    public int getMaxTier() {
        return 11;
    }
}
