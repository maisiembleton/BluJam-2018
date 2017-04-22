package game;

import core.Level;

/**
 * Created by zva on 22/04/17.
 */
public class TestLevel extends Level {

    private PlayerObject player = new PlayerObject();

    public TestLevel() {
        addGameObject(new PlayerObject());
        addGameObject(new PlatformObject(5, 5));
    }
}
