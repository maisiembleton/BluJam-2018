package game.buttons;

import core.Asset;
import core.AssetHandler;
import core.Game;
import core.Level;
import game.Button;
import game.levels.Level1;

/**
 * Created by zva on 22/04/17.
 */
public class NextLevelObject extends Button  {


    private Asset asset;

    private float width;
    private float height;
    private Level next;

    public NextLevelObject(float x, float y, Level nextLevel) {
        position.x = x;
        position.y = y;
        next = nextLevel;
        width = 378;
        height = 81;


        asset = AssetHandler.getAsset("nextlevel.png");



    }




    @Override
    public Asset getAsset() {
        return asset;
    }


    @Override
    public void onMove(Game game, int x, int y) {

    }

    @Override
    public void onClick(Game game, int x, int y) {
        if (x > position.x && x < position.x + width &&
                y > position.y && y < position.y + height) {
            game.changeLevel(next);
        }
    }



}
