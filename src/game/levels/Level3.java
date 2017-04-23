package game.levels;

import core.Level;
import game.Background;
import game.PlayerObject;
import game.inBetweenScreen.InBetweenLevel;
import game.levelElements.*;

/**
 * Created by sam on 23/04/17.
 */
public class Level3 extends Level {

    private PlayerObject player = new PlayerObject();

    public Level3() {
        int floorX = 0;
        addGameObject(new Background(0, 0));
        addGameObject(new PlayerObject(20, 680));

        //wall
        addGameObject(new WallObject(-80, 0));
        addGameObject(new WallObject(1280, 0));

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


        //portal

        InBetweenLevel inbetweenLevel = new InBetweenLevel(this, new Level4(), 0);
        PortalObject portal = new PortalObject(1140, 55, inbetweenLevel);
        addGameObject(portal);

    }



    /**

     //addGameObject(new PlatformObject(5, 200));
     //addGameObject(new SpikesObject(5, 232));
     //addGameObject(new SpikesObject2(50, 300));
     //addGameObject(new BoxObject(400, 300));
     }*/
}
