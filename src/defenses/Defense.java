package defenses;

import java.util.Map;

public abstract class Defense {
    public abstract Map<Integer, Integer> health();
    public abstract int getMaxTier();
    public int getHealth(int tier) {
        return health().get(tier);
    }
}
