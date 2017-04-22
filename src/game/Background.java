package game;

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
public class Background extends GameObject {



    private Asset asset;

    public Background(float x, float y) {
        position.x = 0;
        position.y = 0;

        asset = AssetHandler.getAsset("bg (1).png");
    }


    @Override
    public Asset getAsset() {
        return asset;
    }

    @Override
    public void update(float dt) {

    }


}
