package enums;

public enum Gender {
    MALE,
    FEMALE,
    NEUTER;

    @Override
    public String toString() {return this.name();}
}
