package com.peel.game.scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.SpriteDrawable;
import com.badlogic.gdx.utils.Align;
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
    private Label timeLabel, levelLabel, bestLabel;
    //Buttons

    //ButtonTextures

    //Buttons Setup
    private Table levelsTable;
    private TextureAtlas buttonAtlas;
    private TextButton.TextButtonStyle textButtonStyle;
    private BitmapFont font;
    private Skin skin;

    public HudScene(final PeelGame game){
        //Setup-----------------------------------------------------------------
        viewport = new FitViewport(PeelGame.V_WIDTH, PeelGame.V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, game.batch);
        font = new BitmapFont();

        //Label-----------------------------------------------------------------

        //Buttons Setup-----------------------------------------------------------------

        //Buttons-----------------------------------------------------------------

        //Button Listeners------------------------------------------------------------------

        //Table setup-----------------------------------------------------------------

        //Table-----------------------------------------------------------------

        //Stage-----------------------------------------------------------------

    }
}
