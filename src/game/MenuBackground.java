package game;

import core.Asset;
import core.AssetHandler;
import core.GameObject;

/**
 * Created by zva on 22/04/17.
 */
public class MenuBackground extends GameObject {



    private Asset asset;

    public MenuBackground(float x, float y) {
        position.x = 0;
        position.y = 0;

        asset = AssetHandler.getAsset("titlepage.png");
    }


    @Override
    public Asset getAsset() {
        return asset;
    }

    @Override
    public void update(float dt) {

    }


}
