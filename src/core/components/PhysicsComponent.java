package core.components;

import core.GameObject;
import processing.core.PVector;

import java.util.Collection;
import java.util.Stack;

/**
 * Created by zva on 21/04/17.
 */
public class PhysicsComponent {

    public static float gravityStrength = 1;

    private boolean gravity = true;
    private boolean drag = true;

    GameObject obj;
    float mass;
    float dragCoefficent = 0.5f;

    PVector velocity = new PVector(0, 0);
    PVector acceleration;

    private Stack<PVector> forces = new Stack<>();

    public <T extends GameObject & Physicable> PhysicsComponent(T obj) {
        this.obj = obj;
        this.mass = 1;
    }

    public <T extends GameObject & Physicable> PhysicsComponent(T obj, float mass) {
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

    public void update(float dt) {

        PVector netForce = getNetForce();
        acceleration = netForce.div(mass);
        velocity.add(acceleration);
        PVector deltaPosition = new PVector(velocity.x, velocity.y).mult(dt/1000);
        obj.getPosition().add(velocity);

    }
}
