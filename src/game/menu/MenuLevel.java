package game.menu;

import core.Level;
import game.Background;
import game.PlayerObject;
import game.levelElements.PortalObject;

/**
 * Created by zva on 22/04/17.
 */
public class MenuLevel extends Level {

    //private PlayerObject player = new PlayerObject();

    public MenuLevel() {
        addGameObject(new Background(0, 0));
        addGameObject(new TitleObject(380, 100));
        addGameObject(new PlayButtonObject(450, 450));
        addGameObject(new ExitButtonObject(450, 550));
        addGameObject(new PortalObject(1210, 655));



    }

}