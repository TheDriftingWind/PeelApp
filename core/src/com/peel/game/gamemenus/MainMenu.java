package com.peel.game.gamemenus;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.peel.game.PeelGame;
import com.peel.game.scenes.MainScene;

/**
 * Created by Charles on 5/18/2017.
 */

public class MainMenu implements Screen {

    //Setup
    private PeelGame game;
    private OrthographicCamera gameCam;
    private Viewport gamePort;
    private MainScene mainMenuScene;

    public MainMenu(PeelGame game){
        this.game = game;
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(PeelGame.V_WIDTH, PeelGame.V_HEIGHT, gameCam);

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void dispose() {

    }
}
