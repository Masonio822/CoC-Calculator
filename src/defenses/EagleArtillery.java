package defenses;

import java.util.Map;

import static java.util.Map.entry;

public class EagleArtillery extends Defense {
    public Map<Integer, Integer> health() {
        return Map.ofEntries(
                entry(1, 4000),
                entry(2, 4400),
                entry(3, 4800),
                entry(4, 5200),
                entry(5, 5600),
                entry(6, 5900),
                entry(7, 6200)
        );
    }

    public int getMaxTier() {
        return 7;
    }
}
