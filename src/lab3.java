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

        mother.decide("");
        father.decide("не говорить, о " + carlson);
        System.out.println();

        mother.understand("");
        father.understand("что будет происходить в " + smallsHouse + ", если ");
        programmeAboutCarlson.tellNewsStory();
        newspaperAboutCarlson.printOut();
        magazineAboutCarlson.printOut();
        System.out.println();

        bosse.know("всё это сам");
        System.out.println();

        bosse.see("");
        bethan.see("");
        mother.see("");
        father.see(carlsonHouse.toString());
        System.out.println();

        bosse.climb(smallsHouse.getRoof());
        bethan.climb(smallsHouse.getRoof());
        mother.climb(smallsHouse.getRoof());
        father.climb(smallsHouse.getRoof());
        System.out.println();

        small.show(carlsonHouse);

    }
}