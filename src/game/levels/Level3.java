package game.levels;

import core.Level;
import game.Background;
import game.PlayerObject;
import game.levelElements.PlatformObject;
import game.levelElements.TileObject1;
import game.levelElements.TileObject2;
import game.levelElements.TileObject3;

/**
 * Created by sam on 23/04/17.
 */
public class Level3 extends Level {

    private PlayerObject player = new PlayerObject();

    public Level3() {
        int floorX = 0;
        addGameObject(new Background(0, 0));
        addGameObject(new PlayerObject(20, 680));


        //platforms

        addGameObject(new PlatformObject(180, 780));
        addGameObject(new PlatformObject(360, 660));
        addGameObject(new PlatformObject(540, 540));
        addGameObject(new PlatformObject(720, 420));
        addGameObject(new PlatformObject(900, 300));
        addGameObject(new PlatformObject(1080, 180));


        //floor

        while (floorX < 1280) {

            addGameObject(new TileObject1(floorX, 750));
            floorX += 64;
            addGameObject(new TileObject2(floorX, 750));
            floorX += 64;
            addGameObject(new TileObject3(floorX, 750));
            floorX += 64;


        }


    }



    /**

     //addGameObject(new PlatformObject(5, 200));
     //addGameObject(new SpikesObject(5, 232));
     //addGameObject(new SpikesObject2(50, 300));
     //addGameObject(new BoxObject(400, 300));
     }*/
}
