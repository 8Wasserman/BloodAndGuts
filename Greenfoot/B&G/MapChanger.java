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
          if (Greenfoot.isKeyDown("s")) // Checks if S key is pressed
               Greenfoot.setWorld(new Background()); //Changes world if above statement occurs
        }
    }    

