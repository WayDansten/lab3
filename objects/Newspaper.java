package objects;

public class Newspaper extends PaperMedia {

    public Newspaper(String heading, String information) {
        super(heading, information);
    }

    @Override
    public String toString() {return "Газета";}

    @Override
    public int hashCode() {return getHeading().hashCode() * getInformation().hashCode();}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Newspaper n = (Newspaper) obj;
        return getHeading().equals(n.getHeading()) && getInformation().equals(n.getInformation());
    }

}
