package objects;

public abstract class Media {

    private String heading;
    private String information;

    public Media(String heading, String information) {
        this.information = information;
        this.heading = heading;
    }

    public String getInformation() {return this.information;}
    public void setInformation(String information) {this.information = information;}
    public String getHeading() {return this.heading;}
    public void setHeading(String heading) {this.heading = heading;}

}
