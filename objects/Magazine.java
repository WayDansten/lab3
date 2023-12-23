package objects;

public class Magazine extends PaperMedia {
    private int pageCount;
    public Magazine(String heading, String information, int pageCount) {
        super(heading, information);
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Журнал";
    }

    @Override
    public int hashCode() {
        return getHeading().hashCode() * getInformation().hashCode() * pageCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Magazine mag = (Magazine) obj;
        return getHeading().equals(mag.getHeading()) && getInformation().equals(mag.getInformation()) && pageCount == mag.pageCount;
    }

}
