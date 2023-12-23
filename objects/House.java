package objects;

import enums.Material;

import java.util.Objects;

public class House {
    private final int capacity;
    private String houseName;
    public final Roof roof;

    public House(int capacity, Material roofMaterial, String houseName) {
        this.capacity = capacity;
        this.houseName = houseName;
        this.roof = new Roof(roofMaterial);
    }

    public int getCapacity() {
        return this.capacity;
    }
    
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    
    public String getHouseName() {
        return this.houseName;
    }
    
    public Roof getRoof() {
        return this.roof;
    }

    @Override
    public String toString() {
        return houseName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.capacity, this.houseName, this.roof);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        House n = (House) obj;
        return this.capacity == n.capacity && this.houseName.equals(n.houseName) && this.roof.equals(n.roof);
    }

    public static class Roof {
        private Material roofMaterial;

        public Roof(Material roofMaterial) {
            this.roofMaterial = roofMaterial;
        }

        public void setMaterial(Material roofMaterial) {
            this.roofMaterial = roofMaterial;
        }

        public Material getMaterial() {
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

}
