package objects;

import enums.MediaType;
import interfaces.DigitalMediaActions;

public abstract class DigitalMedia extends Media implements DigitalMediaActions {

    private final MediaType mediaType;

    public DigitalMedia(String heading, String information, MediaType mediaType) {
        super(heading, information);
        this.mediaType = mediaType;
    }

    public MediaType getMediaType() {return this.mediaType;}

    @Override
    public void tellNewsStory() {System.out.print("По " + this.toString() + " идёт передача \"" + this.getHeading() + "\" ");}

    @Override
    public String toString() {return "Цифровое СМИ";}

}
