package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class ArcherTower extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 380),
                entry(2, 420),
                entry(3, 460),
                entry(4, 500),
                entry(5, 540),
                entry(6, 580),
                entry(7, 630),
                entry(8, 690),
                entry(9, 750),
                entry(10, 810),
                entry(11, 890),
                entry(12, 970),
                entry(13, 1050),
                entry(14, 1130),
                entry(15, 1230),
                entry(16, 1310),
                entry(17, 1390),
                entry(18, 1510),
                entry(19, 1600),
                entry(20, 1700),
                entry(21, 1800)
        );
    }
    public int getMaxTier() {
        return 21;
    }
}
