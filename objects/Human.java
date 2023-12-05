package objects;

import interfaces.GeneralActions;
import interfaces.MentalActions;
import interfaces.PhysicalActions;
import interfaces.VoiceActions;
import enums.*;

public class Human implements VoiceActions, PhysicalActions, MentalActions, GeneralActions {
    private String name;
    private final int dna;
    private final Gender gender;

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
            case MALE -> System.out.print(this.toString() + "говорил " + phrase);
            case FEMALE -> System.out.print(this.toString() + "говорила " + phrase);
        }
    }

    @Override
    public void climb(Roof r) {
        switch (this.gender) {
            case MALE -> System.out.print(this.toString() + "залез на " + r);
            case FEMALE -> System.out.print(this.toString() + "залезла на " + r);
        }
    }

    @Override
    public void go() {
        switch(this.gender) {
            case MALE -> System.out.print(this.toString() + "пошёл "));
            case FEMALE -> System.out.print(this.toString() + "пошла "));
        }
    }

    @Override
    public void see(String seenEvent) {
        switch(this.gender) {
            case MALE -> System.out.print(this.toString() + "видел " + seenEvent);
            case FEMALE -> System.out.print(this.toString() + "видела " + seenEvent);
        }
    }

    @Override
    public void show(Object shownObject) {
        switch(this.gender) {
            case MALE -> System.out.print(this.toString() + "показал " + shownObject.toString());
            case FEMALE -> System.out.print(this.toString() + "показала " + shownObject.toString());
        }
    }

    @Override
    public void decide(String decision) {
        switch (this.gender) {
            case MALE -> System.out.print(this.toString() + "решил " + decision);
            case FEMALE -> System.out.print(this.toString() + "решила " + decision);
        }
    }

    @Override
    public void understand(String thought) {
        switch (this.gender) {
            case MALE -> System.out.print(this.toString() + "понимал " + thought);
            case FEMALE -> System.out.print(this.toString() + "понимала " + thought);
        }
    }

    @Override
    public void know(String knowledge) {
        switch (this.gender) {
            case MALE -> System.out.print(this.toString() + "знал " + knowledge);
            case FEMALE -> System.out.print(this.toString() + "знала " + knowledge);
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

    public Gender getGender() {return this.gender;}

}
