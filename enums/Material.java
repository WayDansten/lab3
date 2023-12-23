package enums;

public enum Material {
    WOOD ("Дерево"),
    METAL ("Металл"),
    ROOF_TILE ("Черепица");

    private final String materialName;

    Material(String materialName) {this.materialName = materialName;}

    @Override
    public String toString() {return this.materialName;}
}
