package core.components;

import core.Debug;
import core.GameObject;

import java.util.Collection;

/**
 * Created by zva on 21/04/17.
 */
public class ColliderComponent {

    private GameObject obj;
    private GameObject collidedWith;
    private Rectangle collisionBox;

    public <T extends GameObject & Collidable> ColliderComponent(T obj) {
        this.obj = obj;
        this.collisionBox = new Rectangle(0, 0, 32, 32);
    }

    public <T extends GameObject & Collidable> ColliderComponent(T obj, float width, float height) {
        this.obj = obj;
        this.collisionBox = new Rectangle(width, height);
    }

    public boolean hasCollided() {
        return collidedWith != null;
    }

    public boolean collidesWith(Collidable otherObj) {
        return this.collisionBox.overlaps(otherObj.getCollider().collisionBox);
    }

    private class Rectangle {
        private float dx = 0;
        private float dy = 0;
        private float width;
        private float height;

        private float getAbsX() {
            return obj.getPosition().x + dx;
        }

        private float getAbsY() {
            return obj.getPosition().y + dy;
        }

        private float getAbsX2() {
            return getAbsX()+width;
        }

        private float getAbsY2() {
            return getAbsY()+height;
        }

        private Rectangle(float width, float height) {
            this.width = width;
            this.height = height;
        }

        private Rectangle(float dx, float dy, float width, float height) {
            this.dx = dx;
            this.dy = dy;
            this.width = width;
            this.height = height;
        }

        private boolean overlaps(Rectangle otherRectangle) {
            return this.getAbsX() < otherRectangle.getAbsX2() &&
                    this.getAbsX2() > otherRectangle.getAbsX() &&
                    this.getAbsY() < otherRectangle.getAbsY2() &&
                    this.getAbsY2() > otherRectangle.getAbsY();
        }
    }
}
