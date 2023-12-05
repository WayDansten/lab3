package objects;

import enums.MediaType;

import java.util.Objects;

public class TelevisionProgramme extends DigitalMedia {
    
    private int length;
    
    public TelevisionProgramme(String heading, String information, int length) {
        super(heading, information, MediaType.VIDEO);
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public int getLength() {
        return this.length;
    }

    @Override
    public String toString() {
        return "Телевидение";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.length, this.getHeading(), this.getInformation(), this.getMediaType());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TelevisionProgramme n = (TelevisionProgramme) obj;
        return getHeading().equals(n.getHeading()) && getInformation().equals(n.getInformation()) && this.getMediaType().equals(n.getMediaType()) && this.length == n.length;
    }

}
