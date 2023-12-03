package interfaces;

import enums.Gender;
import enums.Truth;

public interface MentalActions {
    public void decide(String decision, Truth t);
    public void understand(String thought, Truth t);

    public void know(String knowledge, Truth t);

}
