package game.inBetweenScreen;

import core.Asset;
import core.AssetHandler;
import core.GameObject;

/**
 * Created by zva on 22/04/17.
 */
public class MiniTitleObject extends GameObject {



    private Asset asset;

    public MiniTitleObject(float x, float y) {
        position.x = x;
        position.y = y;

        asset = AssetHandler.getAsset("title (1).png");
    }


    @Override
    public Asset getAsset() {
        return asset;
    }

    @Override
    public void update(float dt) {

    }
}
