import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class escListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class escListener extends Actor
{
    /**
     * Act - do whatever the escListener wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("escape")) // Checks if ESC key is pressed
               Greenfoot.setWorld(new Start()); //Changes world if above statement occurs
    }    
}
