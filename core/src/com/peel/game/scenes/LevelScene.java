package com.peel.game.scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.peel.game.PeelGame;

/**
 * Created by Charles on 5/19/2017.
 */

public class LevelScene {

    //Setup
    public Stage stage;
    private Viewport viewport;

    //Labels
    private Label levelLabel;


    //Buttons

    //Buttons Setup
    private Table levelsTable; //TODO: Add levels
    private TextureAtlas buttonAtlas;
    private TextButton.TextButtonStyle textButtonStyle;
    private BitmapFont font;
    private Skin skin;

    public LevelScene(PeelGame game){
        //Setup-----------------------------------------------------------------
        viewport = new FitViewport(PeelGame.V_WIDTH, PeelGame.V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, game.batch);
        font = new BitmapFont();

        //Label-----------------------------------------------------------------
        levelLabel = new Label("SELECT LEVEL", new Label.LabelStyle(font, Color.WHITE));
        levelLabel.setFontScale(5,3);
        levelLabel.setAlignment(Align.top);
        levelLabel.setFillParent(true);
        //Buttons Setup-----------------------------------------------------------------
        buttonAtlas = new TextureAtlas("ui/button.pack");
        skin = new Skin(buttonAtlas);
        textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.font = font;
        textButtonStyle.up = skin.getDrawable("button.up");
        textButtonStyle.down = skin.getDrawable("button.down");
        textButtonStyle.pressedOffsetX = 0;
        textButtonStyle.pressedOffsetY = 0;
        //Buttons-----------------------------------------------------------------

        //Button Listeners------------------------------------------------------------------

        //Table setup-----------------------------------------------------------------

        //Table-----------------------------------------------------------------

        //Stage-----------------------------------------------------------------
        stage.addActor(levelLabel);
    }
}
