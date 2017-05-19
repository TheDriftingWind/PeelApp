package com.peel.game.scenes;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by Charles on 5/18/2017.
 */

public class MainScene {
    //Variables
    public Stage stage;
    private Viewport viewport;

    //Labels
    private Label title;

    //Buttons
    private TextButton playButton, settingsButton;
    private ImageButton aboutButton;
    private Table buttonTable;
}
