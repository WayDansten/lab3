import enums.*;
import exceptions.AcrophobiaException;
import interfaces.ClimbActions;
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

        House carlsonHouse = new House(1, Material.WOOD, "Домик Карлсона");
        House smallsHouse = new House(10, Material.ROOF_TILE, "Дом Малыша");

        mother.notLike(carlson);
        father.notLike(carlson);
        bosse.notLike(carlson);
        bethan.notLike(carlson);
        //small.notLike(carlson);
        System.out.println();

        mother.consider("");
        father.consider("");
        bosse.consider("");
        bethan.consider(carlson + " " + BadTraits.ABSURD.toString() + " " + BadTraits.RUDE + " " + BadTraits.UNBEARABLE + " озорник");
        System.out.println();

        mother.decide("");
        father.decide("не говорить о " + carlson);
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

        bosse.climb(smallsHouse.getRoof().toString());
        bethan.climb(smallsHouse.getRoof().toString());
        mother.climb(smallsHouse.getRoof().toString());
        father.climb(smallsHouse.getRoof().toString());
        System.out.println();

        System.out.print("Обычно так");
        ClimbActions pipeCleaner = new ClimbActions() {
            @Override
            public void climb(String destination) {
                System.out.print(" Трубочист залез " + destination);
            }
        };
        pipeCleaner.climb("");
        System.out.println();

        class Pipe {
            private int length;
            public Pipe() {
                length = 10;
            }
            public Pipe(int length) {
                this.length = length;
            }
            public void setLength(int length) {
                this.length = length;
            }
            public int getLength() {
                return length;
            }
            @Override
            public String toString() {
                return "труба";
            }
            @Override
            public int hashCode() {
                return length;
            }
            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null) return false;
                if (this.getClass() != obj.getClass()) return false;
                Pipe pipe = (Pipe) obj;
                return length == pipe.length;
            }
        }

        small.show(carlsonHouse.toString() + " за " + new Pipe());
        System.out.println();

        try {
            mother.look(Direction.DOWN);
        }
        catch (AcrophobiaException ae) {
            mother.head.getDizzy();
            mother.rightArm.grab(new Pipe());
        }

    }
}