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
    public void say(String message, Human h, Truth t) {
        switch (this.gender) {
            case MALE -> System.out.print(this + (t + "сказал ") + h + message);
            case FEMALE -> System.out.print(this + (t + "сказала ") + h + message);
        }
    }
    @Override
    public void say(String message, Truth t) {
        switch (this.gender) {
            case MALE -> System.out.print(this + (t + "говорил ") + message);
            case FEMALE -> System.out.print(this + (t + "говорила ") + message);
        }
    }

    @Override
    public void climb(Truth t, Object o) {
        switch (this.gender) {
            case MALE -> System.out.print(this + (t + "залез на ") + o);
            case FEMALE -> System.out.print(this + (t + "залезла на ") + o);
        }
    }

    @Override
    public void climb(Truth t) {
        switch (this.gender) {
            case MALE -> System.out.print(this + (t + "залез "));
            case FEMALE -> System.out.print(this + (t + "залезла "));
        }
    }

    @Override
    public void go(Truth t) {
        switch(this.gender) {
            case MALE -> System.out.print(this + (t + "пошёл "));
            case FEMALE -> System.out.print(this + (t + "пошла "));
        }
    }

    @Override
    public void see(Truth t, String seenEvent) {
        switch(this.gender) {
            case MALE -> System.out.print(this + (t + "видел ") + seenEvent);
            case FEMALE -> System.out.print(this + (t + "видела ") + seenEvent);
        }
    }

    @Override
    public void show(Truth t, Object shownObject) {
        switch(this.gender) {
            case MALE -> System.out.print(this + (t + "показал ") + shownObject);
            case FEMALE -> System.out.print(this + (t + "показала ") + shownObject);
        }
    }

    @Override
    public void decide(String decision, Truth t) {
        switch (this.gender) {
            case MALE -> System.out.print(this + (t + "решил ") + decision);
            case FEMALE -> System.out.print(this + (t + "решила ") + decision);
        }
    }

    @Override
    public void understand(String thought, Truth t) {
        switch (this.gender) {
            case MALE -> System.out.print(this + (t + "понимал ") + thought);
            case FEMALE -> System.out.print(this + (t + "понимала ") + thought);
        }
    }

    @Override
    public void know(String knowledge, Truth t) {
        switch (this.gender) {
            case MALE -> System.out.print(this + (t + "знал ") + knowledge);
            case FEMALE -> System.out.print(this + (t + "знала ") + knowledge);
        }
    }

    @Override
    public void exist() {System.out.print(this + " существует ");}

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
