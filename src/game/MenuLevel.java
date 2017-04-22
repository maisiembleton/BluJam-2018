package game;

import core.Level;

/**
 * Created by zva on 22/04/17.
 */
public class MenuLevel extends Level {

    //private PlayerObject player = new PlayerObject();

    public MenuLevel() {

        addGameObject(new Background(0, 0));

        addGameObject(new PlayerObject());
        addGameObject(new PlatformObject(5, 200));
        addGameObject(new WallObject(-80, 0));
        addGameObject(new WallObject(1280, 0));
        addGameObject(new TileObject1(0, 750));
        addGameObject(new TileObject2(64, 750));
        addGameObject(new TileObject3(128, 750));
        addGameObject(new TileObject1(192, 750));
        addGameObject(new SpikesObject(5, 232));
        addGameObject(new SpikesObject2(50, 300));
        addGameObject(new BoxObject(400, 300));
    }
}
