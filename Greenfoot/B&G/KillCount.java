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
        Font font = getWorld().getBackground().getFont();  
        font = font.deriveFont(28.0f);  
        getWorld().getBackground().setFont(font);  
        getWorld().getBackground().setColor(Color.blue);//or another color  
        getWorld().getBackground().drawString("Zombies Killed: ", 3, 25);  
    }    
}
