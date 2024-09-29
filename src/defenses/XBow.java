package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class XBow extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 1500),
                entry(2, 1900),
                entry(3, 2300),
                entry(4, 2700),
                entry(5, 3100),
                entry(6, 3400),
                entry(7, 3700),
                entry(8, 4000),
                entry(9, 4200),
                entry(10, 4400),
                entry(11, 4600)
        );
    }
    public int getMaxTier() {
        return 11;
    }
}
