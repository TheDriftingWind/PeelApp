package com.peel.game.scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.peel.game.PeelGame;


/**
 * Created by Charles on 5/22/2017.
 */

public class HudScene {

    //Setup
    public Stage stage;
    private Viewport viewport;

    //Labels
    private Label sizeLabel, timeLabel, bestLabel;
    private Label sizeCounter, timeCounter, bestTime;
    private int size, time, best;
    private Table labelTable, numbersTable;

    private BitmapFont font;

    public HudScene(final PeelGame game){
        //Setup-----------------------------------------------------------------
        viewport = new FitViewport(PeelGame.V_WIDTH, PeelGame.V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, game.batch);
        font = new BitmapFont();

        //Label-----------------------------------------------------------------
        sizeLabel = new Label("Size", new Label.LabelStyle(font, Color.WHITE));
        timeLabel = new Label("Time", new Label.LabelStyle(font, Color.WHITE));
        bestLabel = new Label("Best", new Label.LabelStyle(font, Color.WHITE));
        time = 0;
        //TODO: add best time
        size = 40; // TODO: adjust later

        //Buttons Setup-----------------------------------------------------------------

        //Buttons-----------------------------------------------------------------

        //Button Listeners------------------------------------------------------------------

        //Table setup-----------------------------------------------------------------

        //Table-----------------------------------------------------------------

        //Stage-----------------------------------------------------------------

    }
}
