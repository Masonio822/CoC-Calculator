package spells;

import java.util.Map;

import static java.util.Map.entry;

public class LightningSpell extends Spell{
    @Override
    public Map<Integer, Integer> damage() {
        return Map.ofEntries(
                entry(1, 150),
                entry(2, 180),
                entry(3, 210),
                entry(4, 240),
                entry(5, 270),
                entry(6, 320),
                entry(7, 400),
                entry(8, 480),
                entry(9, 560),
                entry(10, 600),
                entry(11, 640)
        );
    }

    @Override
    public int getMaxTier() {
        return 11;
    }
}
