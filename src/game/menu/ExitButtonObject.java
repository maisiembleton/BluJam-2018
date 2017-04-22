package game.menu;

import core.Asset;
import core.AssetHandler;
import core.GameObject;

/**
 * Created by zva on 22/04/17.
 */
public class ExitButtonObject extends GameObject {


    private Asset asset;

    public ExitButtonObject(float x, float y) {
        position.x = x;
        position.y = y;

        asset = AssetHandler.getAsset("exitbutton.png");
    }


    @Override
    public Asset getAsset() {
        return asset;
    }

    @Override
    public void update(float dt) {

    }
}
