package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class Mortar extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 400),
                entry(2, 450),
                entry(3, 500),
                entry(4, 550),
                entry(5, 600),
                entry(6, 650),
                entry(7, 700),
                entry(8, 800),
                entry(9, 950),
                entry(10, 1100),
                entry(11, 1300),
                entry(12, 1500),
                entry(13, 1700),
                entry(14, 1950),
                entry(15, 2150),
                entry(16, 2300)
        );
    }
    public int getMaxTier() {
        return 16;
    }
}
