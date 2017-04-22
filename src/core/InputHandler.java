package core;

import java.util.HashMap;

/**
 * Created by zva on 22/04/17.
 */
public class InputHandler {
    public final static HashMap<Integer, Boolean> keyDown = new HashMap<>();

    public static boolean isKeyDown(Integer keyCode) {
        return (keyDown.containsKey(keyCode)) ? keyDown.get(keyCode) : false;
    }
}
