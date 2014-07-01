import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Prints Zombies Killed
 * 
 * @author Wasserman & Dykema
 * @version Aplpha 1.0
 */
public class KillCount extends Actor
{
    /**
     * Act - do whatever the KillCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        //String score;
        //setImage(new GreenfootImage(text,24, Color.black, new Color(0, 0, 0, 0,))); 
        //score = "Zombies Killed: " + Background.killCount;
        //getWorld().score.setText("Zombies Killed: " + Background.killCount);
        Background.score.setText("hi");
        getWorld().getBackground().drawString("Kill Count: " + Background.killCount, 3, 25);
        //getWorld().getBackground().drawString(score, 3, 25);
    }
    
    public KillCount()
    {
        this(""); 
    }
    
    public KillCount(String text)
    {
        setText(text);
    }
    
    public void setText(String text)
    {
        setImage(new GreenfootImage(text, 24, Color.black, new Color(0, 0, 0, 0)));
    }
}
