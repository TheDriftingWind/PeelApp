package com.peel.game.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.peel.game.PeelGame;

/**
 * Created by Charles on 5/18/2017.
 */

public class MainScene {
    //Variables
    public Stage stage;
    private Viewport viewport;

    //Labels
    private Label titleLabel;


    //Buttons
    private TextButton playButton, settingsButton;
    private ImageButton aboutButton;

    //Buttons Setup
    private Table buttonTable;
    private TextureAtlas buttonAtlas;
    private TextButton.TextButtonStyle textButtonStyle;
    private BitmapFont font;
    private Skin skin;

    public MainScene(SpriteBatch sb){
        //Setup
        viewport = new FitViewport(PeelGame.V_WIDTH, PeelGame.V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, sb);
        font = new BitmapFont();
        skin = new Skin();
        //Table
        Table table = new Table();
        table.setFillParent(true);
        table.center();

        //Label
        titleLabel = new Label(PeelGame.TITLE, new Label.LabelStyle(font, Color.WHITE));
        titleLabel.setFontScale(10,7);

        //Buttons Setup
        buttonAtlas = new TextureAtlas("ui/button.pack");
        textButtonStyle = new TextButton.TextButtonStyle();
        skin.addRegions(buttonAtlas);
        textButtonStyle.font = font;
        textButtonStyle.up = skin.getDrawable("button.up");
        textButtonStyle.down = skin.getDrawable("button.down");

        //Buttons
        playButton = new TextButton("PLAY", textButtonStyle);
        playButton.getLabel().setFontScale(7,5);
        settingsButton = new TextButton("SETTINGS", textButtonStyle);
        settingsButton.getLabel().setFontScale(7,5);

        //table
        table.add(titleLabel).expand().padTop(10);
        table.row();
        table.add(playButton).expand().padTop(10);
        table.row();
        table.add(settingsButton).expand().padTop(10);

        //Stage
        stage.addActor(table);
    }

}
