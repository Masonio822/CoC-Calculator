package spells;

import java.util.Map;

import static java.util.Map.entry;

public class EarthquakeSpell {
        private final Map<Integer, Double> damage = Map.ofEntries(
                entry(1, 0.14),
                entry(2, 0.17),
                entry(3, 0.21),
                entry(4, 0.25),
                entry(5, 0.29)
        );
        public int getMaxTier() {
            return 5;
        }

        public int getDamage(int tier, int health) {
            return (int) (health * damage.get(tier));
        }
}
