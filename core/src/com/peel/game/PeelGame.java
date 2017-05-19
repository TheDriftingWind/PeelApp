package com.peel.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.peel.game.gamemenus.MainMenu;

public class PeelGame extends Game {
	//APP CONSTATNTS
	public static final int V_HEIGHT = 480;
	public static final int V_WIDTH = 800;
	public static final String TITLE = "Peel";

	public SpriteBatch batch;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
