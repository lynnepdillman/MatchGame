package matchgame;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Block
{
    private int speed;
    
    public Player()
    {
        super(100,400,20,20,Color.black);
        speed = 5;
    }
    
    public void setSpeed(int s)
    {
        speed = s;
    }
    
    public void move(Graphics window)
    {
        draw(window, Color.DARK_GRAY);
        setY(getY() - speed);
        draw(window); 
    }  
}
