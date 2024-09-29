package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class AirSweeper extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 750),
                entry(2, 800),
                entry(3, 850),
                entry(4, 900),
                entry(5, 950),
                entry(6, 1000),
                entry(7, 1050)
        );
    }

    public int getMaxTier() {
        return 7;
    }
}
