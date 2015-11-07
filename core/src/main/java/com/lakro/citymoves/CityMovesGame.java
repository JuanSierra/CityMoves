package com.lakro.citymoves;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.game.BasicGame;
import org.mini2Dx.core.game.GameContainer;
import org.mini2Dx.core.graphics.Graphics;

import java.util.ArrayList;
import java.util.List;

public class CityMovesGame extends BasicGame {
	public static final String GAME_IDENTIFIER = "com.lakro.citymoves";

	private Texture texture;
	private List<Inhabitant> inhabitants;

	@Override
    public void initialise() {
        texture = new Texture("mini2Dx.png");
        inhabitants = new ArrayList<Inhabitant>();

        for(int i=0;i<10000;i++)
            inhabitants.add(new Inhabitant());

    }
    
    @Override
    public void update(float delta) {
        for (Inhabitant i:inhabitants) {
            i.update(delta);
        }
    }

    @Override
    public void render(Graphics g)
    {
        g.drawTexture(texture, 0f, 0f);

        for (Inhabitant i:inhabitants) {
            i.render(this, g);
        }
    }

    @Override
    public void interpolate(float alpha) {
    }
}
