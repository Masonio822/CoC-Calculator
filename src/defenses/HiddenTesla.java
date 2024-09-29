package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class HiddenTesla extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 600),
                entry(2, 630),
                entry(3, 660),
                entry(4, 690),
                entry(5, 730),
                entry(6, 770),
                entry(7, 810),
                entry(8, 850),
                entry(9, 900),
                entry(10, 980),
                entry(11, 1100),
                entry(12, 1200),
                entry(13, 1350),
                entry(14, 1450),
                entry(15, 1550)
        );
    }

    public int getMaxTier() {
        return 15;
    }
}
