package spells;

import java.util.Map;

public abstract class Spell {
    public abstract Map<Integer, Integer> damage();
    public abstract int getMaxTier();
    public int getDamage(int tier) {
        return damage().get(tier);
    }
}
