package com.peel.game.scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
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
import com.peel.game.screens.PlayScreen;

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
    private ImageButton level1button, level2button, level3button;
    //ButtonTextures
    private Texture[] upButtons; //up textures
    private Texture[] downButtons; //down textures
    private Texture lockedTexture;
    //Buttons Setup
    private Table levelsTable; //TODO: Add levels
    private TextureAtlas buttonAtlas;
    private TextButton.TextButtonStyle textButtonStyle;
    private BitmapFont font;
    private Skin skin;

    public LevelScene(final PeelGame game){
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
        //TODO: turn these into texture atlas' later to save space
        upButtons = new Texture[3];
        upButtons[0] = new Texture("levelbuttons/LevelButton1up.png");
        upButtons[1] = new Texture("levelbuttons/LevelButton2up.png");
        upButtons[2] = new Texture("levelbuttons/LevelButton3up.png");
        downButtons = new Texture[3];
        downButtons[0] = new Texture("levelbuttons/LevelButton1down.png");
        downButtons[1] = new Texture("levelbuttons/LevelButton2down.png");
        downButtons[2] = new Texture("levelbuttons/LevelButton3down.png");
        lockedTexture = new Texture("levelbuttons/LevelButtonLocked.png");
        //Buttons-----------------------------------------------------------------
        level1button = new ImageButton(new SpriteDrawable(new Sprite(upButtons[0])), (new SpriteDrawable(new Sprite(downButtons[0]))));
        level2button = new ImageButton(new SpriteDrawable(new Sprite(upButtons[1])), (new SpriteDrawable(new Sprite(downButtons[1]))));
        level3button = new ImageButton(new SpriteDrawable(new Sprite(upButtons[2])), (new SpriteDrawable(new Sprite(downButtons[2]))));
        //Button Listeners------------------------------------------------------------------
        level1button.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                
                game.setScreen(new PlayScreen(game));
            }
        });
        //Table setup-----------------------------------------------------------------
        levelsTable = new Table();
        levelsTable.setFillParent(true);
        levelsTable.center();
        //Table-----------------------------------------------------------------
        //TODO: Figure out why rescaling isn't working
        levelsTable.add(level1button).expandX().fillX();
        levelsTable.add(level2button).expandX().fillX();
        levelsTable.add(level3button).expandX().fillX();
        //Stage-----------------------------------------------------------------
        stage.addActor(levelLabel);
        stage.addActor(levelsTable);
    }
}
