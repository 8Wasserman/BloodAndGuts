import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Goes from end screen to restart
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restart extends Actor
{
    public void act() 
    {
        if (Greenfoot.isKeyDown("t")) // Checks if T
        { 
            Greenfoot.setWorld(new Background()); //Changes world if above statement occurs
            Greenfoot.playSound("MenuSelect.wav"); // Plays menu select audio
        }
    }    
}
