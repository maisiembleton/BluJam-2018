package game;

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
public class SpikesObject extends GameObject implements Collidable, Physicable {

    private PhysicsComponent physics;
    private ColliderComponent collider;

    private Asset asset;

    public SpikesObject(float x, float y) {
        position.x = x;
        position.y = y;


        physics = new PhysicsComponent(this);
        //physics.setGravity(false);
        collider = new ColliderComponent(this, 146, 23);
        asset = AssetHandler.getAsset("spikes (1).png");
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
        return "Spikes 1 :" + position.x + position.y;
    }
}
