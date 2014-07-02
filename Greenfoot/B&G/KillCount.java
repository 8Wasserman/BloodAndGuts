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
    public GreenfootImage label = new GreenfootImage(200, 200);
    /**
     * Act - do whatever the KillCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        //getWorld().getBackground().clear();
        //String score;
        //setImage(new GreenfootImage(text,24, Color.black, new Color(0, 0, 0, 0,))); 
        //score = "Zombies Killed: " + Background.killCount;
        //getWorld().score.setText("Zombies Killed: " + Background.killCount);
        //getWorld().getBackground().drawString("Kill Count: " + Background.killCount, 3, 25);
        //getWorld().getBackground().drawString(score, 3, 25);
        
        //Actually used
        //setText("Kill count: " + Background.killCount);
    }
    
    public KillCount()
    {
        this("");
    }
    
    public KillCount(String text)
    {
    }
    
    public void setText(String text)
    {
        label.clear();
        Font font = new Font("Verdana", Font.BOLD, 10);
        label.setFont(font);
        label.drawString(text, 30, 10);
        setImage(label);
    }
}
