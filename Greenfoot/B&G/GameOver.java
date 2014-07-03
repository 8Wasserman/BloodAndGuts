import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
    }
    
    /**
     Will allow the player to either go to the main or restart
     */
     private void prepare()
    {
        MapChanger mapchanger = new MapChanger();
        addObject(mapchanger, 197, 300);
        OptionChanger optionchanger = new OptionChanger();
        addObject(optionchanger, 1106, 358);
        optionchanger.setLocation(1089, 300);
    }
}
