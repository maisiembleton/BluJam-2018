package game.levels;

import core.Level;
import game.Background;
import game.PlayerObject;
import game.levelElements.*;

/**
 * Created by zva on 22/04/17.
 */
public class Level6 extends Level {

    private PlayerObject player = new PlayerObject();

    public Level6() {
        int floorX = 0;
        addGameObject(new Background(0, 0));
        addGameObject(new PlayerObject(20,680));

        //wall
        addGameObject(new WallObject(-80, 0));
        addGameObject(new WallObject(1280, 0));

        //floor
        while (floorX < 1280) {

            addGameObject(new TileObject1(floorX, 750));
            floorX += 64;
            addGameObject(new TileObject2(floorX, 750));
            floorX += 64;
            addGameObject(new TileObject3(floorX, 750));
            floorX += 64;
        }

        //walls
        addGameObject(new WallObject2(330, -100)); //left top

        addGameObject(new WallObject2(683, 195)); //bottom middle

        addGameObject(new WallObject2(890, -445)); //right top


        //platforms
        addGameObject(new PlatformObject(391, 498)); //left bottom
        addGameObject(new PlatformObject(391, 300)); //left bottom


        addGameObject(new PlatformObject(537, 195)); //middle top

        addGameObject(new PlatformObject(537, 400)); //middle middle

        addGameObject(new PlatformObject(537, 650)); //middle bottom


        //spikes
        addGameObject(new SpikesObject(391, 530)); // left bottom

        addGameObject(new SpikesObject(537, 227)); //middle top




    }



       /**

        //addGameObject(new PlatformObject(5, 200));
        //addGameObject(new SpikesObject(5, 232));
        //addGameObject(new SpikesObject2(50, 300));
        //addGameObject(new BoxObject(400, 300));
    }*/
}
