package core;

import processing.core.PGraphics;

import java.io.File;
import java.util.HashMap;

/**
 * Created by zva on 22/04/17.
 */
public class AssetHandler {

    static final String asset_directory = "data";
    public static final HashMap<String, Asset> assets = new HashMap<>();
    public static Game game;

    public static Asset getAsset(String name) {
        return assets.get(name);
    }

    private static HashMap<String, Asset> loadAssets(String folder_directory, Game game) {
        File folder = new File(folder_directory);
        File[] files = folder.listFiles();
        for (File file : files) {
            Asset asset = Asset.loadAsset(file.getName(), game);
        }

        return new HashMap<>();
    }

}
