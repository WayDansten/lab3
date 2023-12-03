package interfaces;

import enums.Gender;
import enums.Truth;
import objects.Human;

public interface VoiceActions {
    public void say(String message, Human h, Truth t);
    public void say(String message, Truth t);
}
