package game.levelElements;

import core.Asset;
import core.AssetHandler;
import core.GameObject;
import core.components.Collidable;
import core.components.ColliderComponent;
import core.components.Physicable;
import core.components.PhysicsComponent;

/**
 * Created by zva on 22/04/17.
 */
public class BoxObject extends GameObject implements Collidable, Physicable {

    private PhysicsComponent physics;
    private ColliderComponent collider;

    private Asset asset;

    public BoxObject(float x, float y) {
        position.x = x;
        position.y = y;


        physics = new PhysicsComponent(this);
        //physics.setGravity(false);
        collider = new ColliderComponent(this, 64, 64);
        asset = AssetHandler.getAsset("boxtile.png");
    }

    @Override
    public PhysicsComponent getPhysics() {

        return this.physics;
    }

    @Override
    public ColliderComponent getCollider() {
        return collider;
    }

    @Override
    public Asset getAsset() {
        return asset;
    }

    @Override
    public void update(float dt) {

    }

    public String toString() {
        return "Box :" + position.x + position.y;
    }
}
