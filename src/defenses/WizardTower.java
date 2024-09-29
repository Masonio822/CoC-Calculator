package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class WizardTower extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 620),
                entry(2, 650),
                entry(3, 680),
                entry(4, 730),
                entry(5, 840),
                entry(6, 960),
                entry(7, 1200),
                entry(8, 1440),
                entry(9, 1600),
                entry(10, 1900),
                entry(11, 2120),
                entry(12, 2240),
                entry(13, 2500),
                entry(14, 2800),
                entry(15, 3000),
                entry(16, 3150)
        );

    }
    public int getMaxTier() {
        return 16;
    }
}
