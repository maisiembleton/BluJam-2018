package game.inBetweenScreen;

import core.Level;
import game.Background;
import game.buttons.*;
import game.levelElements.PortalObject;
import game.menu.TitleObject;

/**
 * Created by zva on 22/04/17.
 */
public class InBetweenLevel extends Level {

    //private PlayerObject player = new PlayerObject();
    private Level currentLevel;

    private Level nextLevel;
    private float time;



    public InBetweenLevel(Level currentLevel, Level nextLevel, float time) {
        addGameObject(new Background(0, 0));
        addGameObject(new MiniTitleObject(450, 100));
        addGameObject(new NextLevelObject(450, 300, nextLevel));
        addGameObject(new ReplayLevelObject(450, 400, currentLevel));
        addGameObject(new ExitToMainButtonObject(450, 500));
        addGameObject(new ExitButtonObject(450, 600));




    }

}