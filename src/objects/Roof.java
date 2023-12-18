package objects;

import enums.RoofMaterial;

public class Roof {
    private RoofMaterial roofMaterial;

    public Roof(RoofMaterial roofMaterial) {
        this.roofMaterial = roofMaterial;
    }

    public void setRoofMaterial(RoofMaterial roofMaterial) {
        this.roofMaterial = roofMaterial;
    }
    
    public RoofMaterial getRoofMaterial() {
        return this.roofMaterial;
    }

    @Override
    public String toString() {
        return "Крыша из " + this.roofMaterial.toString() + " ";
    }

    @Override
    public int hashCode() {
        return this.roofMaterial.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Roof n = (Roof) obj;
        return this.roofMaterial == n.roofMaterial;
    }
}
