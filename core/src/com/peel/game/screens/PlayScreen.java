package com.peel.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.peel.game.PeelGame;

/**
 * Created by Charles on 5/21/2017.
 */

public class PlayScreen implements Screen {
    //Setup
    private PeelGame game;
    private OrthographicCamera gameCam;
    private Viewport gamePort;

    public PlayScreen(PeelGame game){
        this.game = game;
        gameCam = new OrthographicCamera();
        gamePort = new FitViewport(PeelGame.V_WIDTH, PeelGame.V_HEIGHT, gameCam);
        //TODO: Add game UI/HUD
    }

    @Override
    public void render(float delta) {
        gameCam.update();
        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //draw game resources
        game.batch.setProjectionMatrix(gameCam.combined);
        game.batch.begin();
        game.batch.end();
        //TODO: Draw HUD
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
        //TODO: Gdx.input.setInputProcessor(Hud.stage);
    }
}
