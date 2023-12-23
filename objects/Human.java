package objects;

import enums.Direction;
import exceptions.AcrophobiaException;
import exceptions.RelationshipException;
import interfaces.*;
import enums.Gender;

public class Human implements VoiceActions, PhysicalActions, MentalActions, RelationshipActions, VisualActions, ClimbActions {
    private String name;
    private final int dna;
    private final Gender gender;
    public final Arm leftArm = new Arm();
    public final Arm rightArm = new Arm();
    public final Head head = new Head();

    public Human(String name, int dna, Gender gender) {
        this.name = name;
        this.dna = dna;
        this.gender = gender;
    }

    public Human (String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.dna = (int) (Math.random() * Math.pow(10, 8));
    }

    @Override
    public void say(String phrase) {
        switch (this.gender) {
            case MALE -> System.out.print(this + " говорил " + phrase);
            case FEMALE -> System.out.print(this + " говорила " + phrase);
        }
    }

    @Override
    public void climb(String destination) {
        switch (this.gender) {
            case MALE -> System.out.print(this + " залез на " + destination);
            case FEMALE -> System.out.print(this + " залезла на " + destination);
        }
    }

    @Override
    public void go() {
        switch(this.gender) {
            case MALE -> System.out.print(this + " пошёл ");
            case FEMALE -> System.out.print(this + " пошла ");
        }
    }

    @Override
    public void see(String seenEvent) {
        switch(this.gender) {
            case MALE -> System.out.print(this + " видел " + seenEvent);
            case FEMALE -> System.out.print(this + " видела " + seenEvent);
        }
    }

    @Override
    public void show(String shownEvent) {
        switch(this.gender) {
            case MALE -> System.out.print(this + " показал " + shownEvent);
            case FEMALE -> System.out.print(this + " показала " + shownEvent);
        }
    }

    @Override
    public void decide(String decision) {
        switch (this.gender) {
            case MALE -> System.out.print(this + " решил " + decision);
            case FEMALE -> System.out.print(this + " решила " + decision);
        }
    }

    @Override
    public void understand(String thought) {
        switch (this.gender) {
            case MALE -> System.out.print(this + " понимал " + thought);
            case FEMALE -> System.out.print(this + " понимала " + thought);
        }
    }

    @Override
    public void know(String knowledge) {
        switch (this.gender) {
            case MALE -> System.out.print(this + " знал " + knowledge);
            case FEMALE -> System.out.print(this + " знала " + knowledge);
        }
    }

    @Override
    public void consider(String thought) {
        switch (this.gender) {
            case MALE -> System.out.print(this + " считал " + thought);
            case FEMALE -> System.out.print(this + " считала " + thought);
        }
    }

    @Override
    public void like(Human human) {
        System.out.print(this + " любит " + human + " ");
    }

    @Override
    public void notLike(Human human) {
        if (human.getName().equals("Карлсон") && this.getName().equals("Малыш")) throw new RelationshipException("Неправда! Малыш дружит с Карлсоном");
        System.out.print(this + " не любит " + human + " ");
    }

    @Override
    public void look(Direction direction) throws AcrophobiaException {
        if (direction == Direction.DOWN) throw new AcrophobiaException();
        switch(this.gender) {
            case MALE -> System.out.print(this + " посмотрел " + direction);
            case FEMALE -> System.out.print(this + " посмотрела " + direction);
        }
    }

    @Override
    public String toString() { return name; }

    @Override
    public int hashCode() {return dna * name.hashCode();}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return dna == human.dna && name.equals(human.name) && gender == human.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public class Arm implements ArmActions {

        @Override
        public void grab(Object grabbedObject) {
            switch(Human.this.gender) {
                case MALE -> System.out.print(Human.this + " схватился за " + grabbedObject);
                case FEMALE -> System.out.print(Human.this + " схватилась за " + grabbedObject);
            }
        }

    }

    public class Head implements HeadState {

        @Override
        public void getDizzy() {
            System.out.print("у " + Human.this + " закружилась голова ");
        }

    }

}
