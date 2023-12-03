import enums.*;
import objects.*;

public class lab3 {
    public static void main(String[] args) {

        Human mother = new Human("Мама", Gender.FEMALE);
        Human father = new Human("Папа", Gender.MALE);
        Human carlson = new Human("Карлсон", Gender.MALE);
        Human bosse = new Human("Боссе", Gender.MALE);
        Human bethan = new Human("Бетан", Gender.MALE);
        Human small = new Human("Малыш", Gender.MALE);

        TelevisionProgramme programmeAboutCarlson = new TelevisionProgramme("Кто такой Карлсон?", "Информация о Карлсоне", 30);
        Newspaper newspaperAboutCarlson = new Newspaper("Карлсон у себя дома", "Информация о Карлсоне");
        Magazine magazineAboutCarlson = new Magazine("Карлсон у себя дома", "Информация о Карлсоне", 10);

        House carlsonHouse = new House(1, RoofMaterial.WOOD, "Домик Карлсона");
        House smallsHouse = new House(10, RoofMaterial.ROOF_TILE, "Дом Малыша");

        mother.decide("", Truth.TRUE);
        father.decide("не говорить, что ", Truth.TRUE);
        carlson.exist();
        System.out.println();

        mother.understand("", Truth.TRUE);
        father.understand("что будет происходить в " + smallsHouse + ", если ", Truth.TRUE);
        programmeAboutCarlson.tellNewsStory();
        newspaperAboutCarlson.printout();
        magazineAboutCarlson.printout();
        System.out.println();

        bosse.know("всё это сам", Truth.TRUE);
        System.out.println();

        bosse.see(Truth.TRUE, "");
        bethan.see(Truth.TRUE, "");
        mother.see(Truth.TRUE, "");
        father.see(Truth.TRUE, carlsonHouse.toString());
        System.out.println();

        bosse.climb(Truth.TRUE);
        bethan.climb(Truth.TRUE);
        mother.climb(Truth.TRUE);
        father.climb(Truth.TRUE, smallsHouse.getRoof());
        System.out.println();

        small.show(Truth.TRUE, carlsonHouse);

    }
}