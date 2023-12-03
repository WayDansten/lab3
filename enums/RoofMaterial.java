package enums;

public enum RoofMaterial {
    WOOD ("Дерево"),
    METAL ("Металл"),
    ROOF_TILE ("Черепица");

    private final String materialName;

    RoofMaterial(String materialName) {this.materialName = materialName;}

    @Override
    public String toString() {return this.materialName;}
}
