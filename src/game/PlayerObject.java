package game;

import core.*;
import core.components.Collidable;
import core.components.ColliderComponent;
import core.components.Physicable;
import core.components.PhysicsComponent;
import game.levelElements.PortalObject;
import game.levels.Level1;
import processing.core.PVector;

import javax.swing.*;

/**
 * Created by zva on 22/04/17.
 */
public class PlayerObject extends GameObject implements Collidable, Physicable{

    private ColliderComponent collider;
    private PhysicsComponent physics;
    private Asset asset;

    private PVector spawn = new PVector(0, 0);

    private boolean canJump = false;

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

        collider = new ColliderComponent(this, 70, 33);
        physics = new PhysicsComponent(this);
    }

    public PlayerObject(float x, float y) {
        position.x = x;
        position.y = y;
        spawn = new PVector(x, y);
        asset = AssetHandler.getAsset("test");
        collider = new ColliderComponent(this, 70, 33);
        physics = new PhysicsComponent(this);
    }

    private void handleInput() {
        if (collider.hasCollided()) {
            if (collider.getNormal().y < 0) {
                canJump = true;
            }
        }

        PVector force = new PVector();
        if (InputHandler.isKeyDown(65)) {
            force.add(-4, 0);
        }
        if (InputHandler.isKeyDown(68)) {
            force.add(4, 0);
        }
        if (InputHandler.isKeyDown(87)) {
            force.add(0,-4f);
            if (canJump) {
                physics.velocity.add(0, -64);
                canJump = false;
            }
        }
        if (InputHandler.isKeyDown(83)) {
            force.add(0, 4);
        }

        for (MouseEvent e : InputHandler.getMouseEvents()) {
            Debug.print(e);
        }

        physics.setVelocity(force);
    }

    public void respawn() {
        position.x = spawn.x;
        position.y = spawn.y;
    }

    @Override
    public void update(float dt) {

        asset.toString();
        position.toString();
        handleInput();
        physics.update(dt);
    }
}
