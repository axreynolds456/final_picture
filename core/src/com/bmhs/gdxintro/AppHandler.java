package com.bmhs.gdxintro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.utils.TileHandler;

public class AppHandler extends ApplicationAdapter {
	SpriteBatch batch;
	int x, y;

	int[][] worldIntArray = {{4,4,4,4,4,4,4,0,0,0,1,1,0,4,4,4,4,4,4,4},
							{4,4,4,4,4,4,0,1,1,1,0,1,1,0,4,4,4,4,4,4},
							{4,4,4,4,4,0,1,1,1,1,1,0,0,0,0,4,4,4,4,4},
							{4,4,4,4,4,0,1,1,1,1,1,0,1,1,1,0,4,4,4,4},
							{4,4,4,4,0,1,1,1,1,1,1,1,0,0,1,0,4,4,4,4},
							{4,4,4,4,0,1,1,1,2,2,2,2,1,1,2,0,4,4,4,4},
							{4,4,4,4,0,1,1,1,1,2,3,3,2,3,2,0,4,4,4,4},
							{4,4,4,4,4,0,1,1,1,2,3,3,2,3,2,0,4,4,4,4},
							{4,4,4,4,0,0,1,1,2,2,2,2,2,2,2,0,4,4,4,4},
							{4,4,0,0,1,1,0,1,2,0,0,0,0,2,0,4,4,4,4,4},
							{4,0,1,2,2,2,1,0,2,2,2,2,2,0,0,0,0,0,4,4},
							{4,0,1,1,2,2,1,1,0,0,0,0,0,0,1,1,2,1,0,4},
							{0,1,1,1,2,0,1,1,1,1,1,1,1,1,1,2,1,1,0,4},
							{0,1,1,0,0,0,1,1,3,3,3,1,1,0,2,1,1,1,0,4},
							{0,1,1,1,0,0,0,1,1,3,1,1,0,0,0,0,1,1,0,4},
							{0,1,1,1,0,0,1,0,0,0,0,0,1,0,0,1,1,1,0,4},
							{4,0,0,0,4,0,1,1,1,1,1,1,1,0,0,1,1,1,0,4},
							{4,4,4,4,0,2,0,0,0,1,0,0,0,0,4,0,0,0,4,4},
							{4,4,4,0,1,1,2,2,2,0,2,2,2,1,0,4,4,4,4,4},
							{4,4,0,0,1,1,1,2,0,4,0,2,1,1,0,0,4,4,4,4}};


	@Override
	public void create () {
		batch = new SpriteBatch();

		x = 0;
		y = 0;
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();

		for(int r = 0; r < worldIntArray.length; r++) {
			for(int c = 0; c < worldIntArray[r].length; c++) {
				batch.draw(TileHandler.getTileHandler().getWorldTileArray().get(worldIntArray[r][c]).getTexture(), c* Tile.ON_SCREEN_DEFAULT_WIDTH, Gdx.graphics.getHeight() -Tile.ON_SCREEN_DEFAULT_HEIGHT - (r*Tile.ON_SCREEN_DEFAULT_HEIGHT));
				}
			}



		batch.end();

		checkInput();
	}

	public void checkInput() {

		/*
		if(Gdx.input.isKeyJustPressed(Input.Keys.W)) {
			y += 10;
		}
		else if(Gdx.input.isKeyJustPressed(Input.Keys.S)) {
			y -= 10;
		}
		else if(Gdx.input.isKeyJustPressed(Input.Keys.A)) {
			x -= 10;
		}
		else if(Gdx.input.isKeyJustPressed(Input.Keys.D)) {
			x += 10;
		}


		System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());

		x = Gdx.input.getX() - img.getWidth()/2;
		y = Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2;


		if(x < (Gdx.input.getX() - img.getWidth()/2)) {
			x += 5;
		}
		if(x > (Gdx.input.getX() - img.getWidth()/2)) {
			x -= 5;
		}
		if(y < (Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2)) {
			y += 5;
		}
		if(y > (Gdx.graphics.getHeight() - Gdx.input.getY() - img.getHeight()/2)) {
			y -= 5;
		}
*/
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
