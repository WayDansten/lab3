package enums;

public enum Truth {
    TRUE (" "),
    FALSE (" не ");
    private final String isTrue;
    Truth(String isTrue) {
        this.isTrue = isTrue;
    }
    @Override
    public String toString() { return isTrue; }
}
