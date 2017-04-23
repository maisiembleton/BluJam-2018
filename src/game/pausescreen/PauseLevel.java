package game.pausescreen;

import core.Level;
import game.Background;
import game.buttons.ExitButtonObject;
import game.buttons.ExitToMainButtonObject;

/**
 * Created by zva on 22/04/17.
 */
public class PauseLevel extends Level {

    //private PlayerObject player = new PlayerObject();

    public PauseLevel() {
        addGameObject(new Background(0, 0));
        //addGameObject(new ResumeObject(380, 100));
        //addGameObject(new NextLevelObject(450, 300));
        //addGameObject(new ReplayLevelObject(450, 400));
        addGameObject(new ExitToMainButtonObject(450, 500));
        addGameObject(new ExitButtonObject(450, 600));
        //addGameObject(new PortalObject(1210, 655, null));



    }

}