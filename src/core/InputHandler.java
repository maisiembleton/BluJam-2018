package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zva on 22/04/17.
 */
public class InputHandler {
    public final static HashMap<Integer, Boolean> keyDown = new HashMap<>();
    public final static List<MouseEvent> MOUSE_EVENTS = new ArrayList<>();

    public static boolean isKeyDown(Integer keyCode) {
        return (keyDown.containsKey(keyCode)) ? keyDown.get(keyCode) : false;
    }

    public static void addEvent(MouseEvent evt) {
        MOUSE_EVENTS.add(evt);
    }

    public static List<MouseEvent> getMouseEvents() {
        return MOUSE_EVENTS;
    }

    public static void clearEvents() {
        MOUSE_EVENTS.clear();
    }
}
