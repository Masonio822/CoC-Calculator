package spells;

public enum Spells {
    LIGHTNING_SPELL,
    EARTHQUAKE_SPELL;
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
