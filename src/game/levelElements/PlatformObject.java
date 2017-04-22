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
public class PlatformObject extends GameObject implements Collidable, Physicable {

    private PhysicsComponent physics;
    private ColliderComponent collider;

    private Asset asset;

    public PlatformObject(float x, float y) {
        position.x = x;
        position.y = y;


        physics = new PhysicsComponent(this);
        physics.setGravity(false);
        collider = new ColliderComponent(this, 128, 32);
        asset = AssetHandler.getAsset("platform.png");
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
        return "Platform :" + position.x + position.y;
    }
}
