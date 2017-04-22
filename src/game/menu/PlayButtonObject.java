package game.menu;

import core.Asset;
import core.AssetHandler;
import core.GameObject;
import core.components.Collidable;
import core.components.ColliderComponent;
import core.components.Physicable;
import core.components.PhysicsComponent;

/**
 * Created by zva on 22/04/17.
 */
public class PlayButtonObject extends GameObject {


    private Asset asset;

    public PlayButtonObject(float x, float y) {
        position.x = x;
        position.y = y;

        asset = AssetHandler.getAsset("playbutton.png");
    }


    @Override
    public Asset getAsset() {
        return asset;
    }

    @Override
    public void update(float dt) {

    }
}
