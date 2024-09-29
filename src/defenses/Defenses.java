package defenses;

public enum Defenses {
    AIR_DEFENSE,
    AIR_SWEEPER,
    CANNON,
    ARCHER_TOWER,
    MORTAR,
    INFERNO_TOWER,
    WIZARD_TOWER,
    HIDDEN_TESLA,
    BOMB_TOWER,
    XBOW,
    EAGLE_ARTILLERY,
    SCATTERSHOT,
    BUILDER_HUT,
    SPELL_TOWER,
    MONOLITH,
    MULTI_ARCHER_TOWER,
    RICOCHET_CANNON;
    @Override
    public String toString() {
        String[] wordSplit = name().split("_");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordSplit.length; i++) {
            sb.append(wordSplit[i].charAt(0)).append(wordSplit[i].substring(1).toLowerCase());
            if (!(wordSplit.length - i == 1)) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
