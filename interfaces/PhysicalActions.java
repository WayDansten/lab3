package interfaces;

import enums.Gender;
import enums.Truth;

public interface PhysicalActions {

    public void climb(Truth t);
    public void climb(Truth t, Object o);
    public void go(Truth t);
    public void see(Truth t, String seenEvent);
    public void show(Truth t, Object shownObject);

}
