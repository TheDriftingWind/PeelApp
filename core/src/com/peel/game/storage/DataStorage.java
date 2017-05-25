package com.peel.game.storage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

/**
 * Created by Charles on 5/25/2017.
 * Wrapper class for LibGDX preferences.
 */
public class DataStorage {
    private Preferences levelAccess = Gdx.app.getPreferences("levelAccess");
    private Preferences levelBests = Gdx.app.getPreferences("levelBest");
    private Preferences settings = Gdx.app.getPreferences("gameSettings");
}
