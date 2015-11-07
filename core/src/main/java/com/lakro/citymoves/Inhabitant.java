package com.lakro.citymoves;

import com.badlogic.gdx.graphics.Color;
import org.mini2Dx.core.engine.Renderable;
import org.mini2Dx.core.engine.Updatable;
import org.mini2Dx.core.game.GameContainer;
import org.mini2Dx.core.graphics.Graphics;

/**
 * Created by jksie_000 on 06/11/2015.
 */
public class Inhabitant implements Renderable {
    private int x = 100;
    private int y = 100;
    private float acum = 0;

    public Inhabitant(){}

    public int getX(){return this.x;}
    public void setX(int x){this.x=x;}
    public int getY(){return this.y;}
    public void setY(int y){this.y=0;}

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) {
        graphics.setColor(Color.CYAN);
        graphics.fillRect(this.x,this.y,1,1);
    }

    public void update(float delta) {
        acum += delta;
        if(acum>0.05){
            this.x += Math.random()*5 * Math.floor(Math.random()*2)%2==0?1:-1;
            this.y += Math.random()*5  * Math.floor(Math.random()*2)%2==0?1:-1;
            acum =0;
        }
    }
}
