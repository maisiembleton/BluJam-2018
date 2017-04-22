package game;

import core.*;
import core.components.Collidable;

/**
 * Created by zva on 23/04/17.
 */
public abstract class Button extends GameObject {

    private MouseEvent press;
    private MouseEvent release;

    protected int threshold = 2;


    public abstract void onClick(Game game, int x, int y);

    private void checkClick() {
        if (Math.abs(press.x - release.x) < threshold && Math.abs(press.y - release.y) <= threshold) {
            onClick(release.game, release.x, release.y);
        }
    }

    @Override
    public void update(float dt) {
        for (MouseEvent evt : InputHandler.getMouseEvents()) {
            if (evt.type == MouseEvent.Type.PRESS) {
                press = evt;
            } else if (evt.type == MouseEvent.Type.RELEASE) {
                release = evt;
                checkClick();
            }
        }
    }
}
