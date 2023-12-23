package interfaces;

import enums.Direction;
import exceptions.AcrophobiaException;

public interface VisualActions {
    public void see(String seenEvent);
    public void look(Direction direction) throws AcrophobiaException;
    public void show(String shownEvent);
}
