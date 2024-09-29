package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class Cannon extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 420),
                entry(2, 470),
                entry(3, 520),
                entry(4, 570),
                entry(5, 620),
                entry(6, 670),
                entry(7, 730),
                entry(8, 800),
                entry(9, 880),
                entry(10, 960),
                entry(11, 1060),
                entry(12, 1160),
                entry(13, 1260),
                entry(14, 1380),
                entry(15, 1500),
                entry(16, 1620),
                entry(17, 1740),
                entry(18, 1870),
                entry(19, 2000),
                entry(20, 2150),
                entry(21, 2250)
        );
    }
    public int getMaxTier() {
        return 21;
    }
}
