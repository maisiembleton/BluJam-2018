package game;

import core.*;
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
        PVector force = new PVector();
        if (InputHandler.isKeyDown(65)) {
            force.add(-1, 0);
        }
        if (InputHandler.isKeyDown(68)) {
            force.add(1, 0);
        }
        if (InputHandler.isKeyDown(87)) {
            //force.add(0,-1);
            physics.velocity.add(new PVector(0, -10));
        }
        if (InputHandler.isKeyDown(83)) {
            force.add(0, 1);

        }

        for (MouseEvent e : InputHandler.getMouseEvents()) {
            Debug.print(e);
        }

        physics.addForce(force);
    }

    @Override
    public void update(float dt) {
        asset.toString();
        position.toString();
        handleInput();
        physics.update(dt);
    }
}
