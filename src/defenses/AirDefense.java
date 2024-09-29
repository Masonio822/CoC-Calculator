package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class AirDefense extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 800),
                entry(2, 850),
                entry(3, 900),
                entry(4, 950),
                entry(5, 1000),
                entry(6, 1050),
                entry(7, 1100),
                entry(8, 1210),
                entry(9, 1300),
                entry(10, 1400),
                entry(11, 1500),
                entry(12, 1650),
                entry(13, 1750),
                entry(14, 1850)
        );
    }
    public int getMaxTier() {
        return 14;
    }
}
