package game;

import core.Asset;
import core.AssetHandler;
import core.GameObject;
import core.InputHandler;
import core.components.Collidable;
import core.components.ColliderComponent;
import core.components.Physicable;
import core.components.PhysicsComponent;
import processing.core.PVector;

import javax.swing.*;

/**
 * Created by zva on 22/04/17.
 */
public class PlayerObject extends GameObject implements Collidable, Physicable{

    private ColliderComponent collider;
    private PhysicsComponent physics;
    private Asset asset;

    public Asset getAsset() {
        return asset;
    }
    @Override
    public PhysicsComponent getPhysics() {
        return physics;
    }
    @Override
    public ColliderComponent getCollider() {
        return collider;
    }

    public PlayerObject() {
        asset = AssetHandler.getAsset("test");
        collider = new ColliderComponent(this);
        physics = new PhysicsComponent(this);
    }

    private void handleInput() {
        if (InputHandler.isKeyDown(65)) {
            position.x--;
        }
        if (InputHandler.isKeyDown(68)) {
            PVector force = new PVector(1, 0);
            physics.addForce(force);
        }
        if (InputHandler.isKeyDown(87)) {
            position.y--;
        }
        if (InputHandler.isKeyDown(83)) {
            position.y++;
        }
    }

    @Override
    public void update(float dt) {
        asset.toString();
        position.toString();
        handleInput();
        physics.update(dt);
    }
}
