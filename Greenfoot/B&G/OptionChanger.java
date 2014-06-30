import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OptionChanger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
