package enums;

public enum MediaType {
    TEXT,
    AUDIO,
    VIDEO;

    @Override
    public String toString() {return this.name();}

}
