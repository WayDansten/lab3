package objects;

import interfaces.PaperMediaActions;

public abstract class PaperMedia extends Media implements PaperMediaActions {

    public PaperMedia(String heading, String information) {
        super(heading, information);
    }

    @Override
    public void printOut() {
        System.out.print("Напечатан(а) " + this + " под заголовком \"" + this.getHeading() + "\" ");
    }

    @Override
    public void publish() {
        System.out.print("Опубликован(а) " + this + " под заголовком \"" + this.getHeading() + "\" ");
    }

    @Override
    public void read() {
        System.out.print("В " + this + " написано: " + super.getInformation());
    }

}
