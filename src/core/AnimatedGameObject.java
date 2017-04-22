package core;

import java.util.ArrayList;

/**
 * Created by zva on 23/04/17.
 */
public abstract class AnimatedGameObject extends GameObject {

    private float dtAccumulator = 0;
    private float frameTime = 160;
    private ArrayList<Asset> assets = new ArrayList<>();
    private Asset currentAsset;



    @Override
    public Asset getAsset() {
        return null;
    }

    @Override
    public void update(float dt) {
        dtAccumulator += dt;
        if (dtAccumulator > frameTime) {

        }
    }
}
