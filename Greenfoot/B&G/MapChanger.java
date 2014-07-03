import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Changes from start screen to playable world
 * 
 * @author Wasserman and Dykema 
 * @version Alpha 1.0
 */
public class MapChanger extends Actor
{

    public void act() 
    {
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("r")) // Checks if S or R key is pressed
        { 
            Greenfoot.setWorld(new Background()); //Changes world if above statement occurs
            Greenfoot.playSound("MenuSelect.wav"); // Plays menu select audio
        }
    }    
}
