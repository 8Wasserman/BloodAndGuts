import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MapChanger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapChanger extends Actor
{
    /**
     * Act - do whatever the MapChanger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          if (Greenfoot.isKeyDown("s"))
               Greenfoot.setWorld(new Background());
        }
    }    

