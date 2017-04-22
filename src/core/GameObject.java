package core;

import processing.core.PVector;

import javax.swing.*;

/**
 * Created by zva on 21/04/17.
 */
public abstract class GameObject {
    protected PVector position = new PVector(0, 0);

    public PVector getPosition() {
        return position;
    }
    public abstract Asset getAsset();

    public abstract void update(float dt);
}