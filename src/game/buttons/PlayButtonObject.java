package game.buttons;

import core.Asset;
import core.AssetHandler;
import core.Game;
import game.Button;
import game.levels.Level1;
import game.levels.Level3;
import game.levels.Level5;
import game.levels.Level7;

/**
 * Created by zva on 22/04/17.
 */
public class PlayButtonObject extends Button  {


    private Asset asset;

    private float width;
    private float height;

    public PlayButtonObject(float x, float y) {
        position.x = x;
        position.y = y;
        width = 378;
        height = 81;


        asset = AssetHandler.getAsset("playbutton.png");



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
            game.changeLevel(new Level1());
        }
    }



}
