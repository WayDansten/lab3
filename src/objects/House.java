package objects;

import enums.RoofMaterial;

import java.util.Objects;

public class House {
    private final int capacity;
    private String houseName;
    private final Roof roof;

    public House(int capacity, RoofMaterial roofMaterial, String houseName) {
        this.capacity = capacity;
        this.houseName = houseName;
        this.roof = new Roof(roofMaterial);
    }

    public int getCapacity() {return this.capacity;}
    public void setHouseName(String houseName) {this.houseName = houseName;}
    public String getHouseName() {return this.houseName;}
    public String getRoof() {return this.roof.toString();}

    @Override
    public String toString() {return houseName;}

    @Override
    public int hashCode() {return Objects.hash(this.capacity, this.houseName, this.roof);}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        House n = (House) obj;
        return this.capacity == n.capacity && this.houseName.equals(n.houseName) && this.roof.equals(n.roof);
    }

}
