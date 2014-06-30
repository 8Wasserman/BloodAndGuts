import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Changes to option panel
 * 
 * @author Wasserman and Dykema
 * @version Alpha 1.0
 */
public class OptionChanger extends Actor
{
    /**
     * Act - do whatever the OptionChanger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("c")) // Checks if C key is pressed
               Greenfoot.setWorld(new Controls()); //Changes world if above statement occurs
    }    
}
