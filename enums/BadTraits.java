package enums;

public enum BadTraits {
    RUDE ("Дерзкий"),
    UNBEARABLE ("Несносный"),
    ABSURD ("Вздорный");

    private final String trait;

    BadTraits(String trait) {this.trait = trait;}

    @Override
    public String toString() {return this.trait;}
}
