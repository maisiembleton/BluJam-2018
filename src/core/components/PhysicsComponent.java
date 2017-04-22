package core.components;

import core.Debug;
import core.GameObject;
import processing.core.PVector;

import java.util.Collection;
import java.util.Stack;

/**
 * Created by zva on 21/04/17.
 */
public class PhysicsComponent <T extends GameObject & Physicable & Collidable> {

    public static float gravityStrength = 1;

    private boolean gravity = true;
    private boolean drag = true;

    T obj;
    float mass;
    float dragCoefficent = 0.5f;

    public PVector velocity = new PVector(0, 0);
    PVector acceleration = new PVector(0, 0);
    PVector netForce = new PVector(0, 0);

    private Stack<PVector> forces = new Stack<>();

    public PhysicsComponent(T obj) {
        this.obj = obj;
        this.mass = 1;
    }

    public PhysicsComponent(T obj, float mass) {
        this.obj = obj;
        this.mass = mass;
    }

    public void setGravity(boolean gravity) {this.gravity = gravity;}
    public void setDrag(boolean drag) {this.drag = drag;}

    private PVector getNetForce() {
        PVector netForce;
        if (!forces.isEmpty()) {
            netForce = forces.pop();
            while (!forces.isEmpty()) {
                netForce.add(forces.pop());
            }
        } else {
            netForce = new PVector(0, 0);
        }

        if (gravity) {
            netForce.add(new PVector(0, gravityStrength));
        }

        if (drag) {
            netForce.add(new PVector(velocity.x, velocity.y).mult(-dragCoefficent));
        }

        return netForce;
    }

    public void addForce(PVector force) {
        forces.add(force);
    }

    private void resolveCollision() {
        ColliderComponent collider = obj.getCollider();
        if (collider.hasCollided()) {
            Collidable collidedWith = collider.getCollidedWith();
            PVector originalPos = new PVector(obj.getPosition().x, obj.getPosition().y);
            char normal = 'o';
            while (obj.getCollider().collidesWith(collidedWith)) {
                obj.getPosition().add(-velocity.x*0.001f, -velocity.y*0.001f);
                if (!obj.getCollider().xOverlaps(collidedWith)) {
                    normal = 'x';
                } else if (!obj.getCollider().yOverlaps(collidedWith)) {
                    normal = 'y';
                }
            }


            if (normal == 'x') {
                Debug.print(normal);
                netForce = new PVector(0, netForce.y);
              velocity = new PVector(0, velocity.y);

            } else if (normal == 'y') {
                Debug.print(normal);
                velocity = new PVector(velocity.x, 0);
                netForce = new PVector(netForce.x, 0);
                velocity = new PVector(velocity.x, 0);
            }

        }
    }

    public void update(float dt) {


        netForce = getNetForce();
        resolveCollision();

        acceleration = netForce.div(mass);
        velocity.add(acceleration);
        PVector deltaPosition = new PVector(velocity.x, velocity.y).mult(dt/1000);
        obj.getPosition().add(velocity);

    }
}
