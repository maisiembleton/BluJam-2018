package game.menu;

import core.Asset;
import core.AssetHandler;
import core.Game;
import core.GameObject;
import game.Button;
import game.TestLevel;

/**
 * Created by zva on 22/04/17.
 */
public class ExitButtonObject extends Button {

    private float width;
    private float height;

    private Asset asset;

    public ExitButtonObject(float x, float y) {
        position.x = x;
        position.y = y;
        width = 378;
        height = 81;


        asset = AssetHandler.getAsset("exitbutton.png");
    }


    @Override
    public Asset getAsset() {
        return asset;
    }



    @Override
    public void onClick(Game game, int x, int y) {
        if (x > position.x && x < position.x + width &&
                y > position.y && y < position.y + height) {
            
            game.exit();
        }
    }
}
