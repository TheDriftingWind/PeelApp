package com.peel.game.gamemenus;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
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
        mainMenuScene = new MainScene(game);
    }

    @Override
    public void render(float delta) {
        gameCam.update();
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //draw game resources
        game.batch.setProjectionMatrix(gameCam.combined);
        game.batch.begin();
        game.batch.end();
        //draw menu screen
        game.batch.setProjectionMatrix(mainMenuScene.stage.getCamera().combined);
        mainMenuScene.stage.act(delta);
        mainMenuScene.stage.draw();


    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void dispose() {

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
        Gdx.input.setInputProcessor(mainMenuScene.stage);
    }
}
