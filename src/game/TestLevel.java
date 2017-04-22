package game;

import core.Level;

/**
 * Created by zva on 22/04/17.
 */
public class TestLevel extends Level {

    private PlayerObject player = new PlayerObject();

    public TestLevel() {

        addGameObject(new Background(0, 0));

        addGameObject(new PlayerObject());
        addGameObject(new PlatformObject(5, 200));
        addGameObject(new WallObject(-50, 0));
        addGameObject(new WallObject(1250, 0));
    }
}
