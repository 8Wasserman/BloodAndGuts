import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start page with name and method (MapChanger) into playable world.
 * 
 * @author Wasserman and Dykema 
 * @version Alpha 1.0
 */
public class Start extends World
{

    public Start()
    {    
        // Create a world with dimensions 1280 by 720 cells with a cell size of 1 pixel
        super(1280, 720, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        MapChanger mapchanger = new MapChanger();
        addObject(mapchanger, 1111, 313);
        MapChanger mapchanger2 = new MapChanger();
        addObject(mapchanger2, 171, 338);
        mapchanger2.setLocation(169, 325);
        
    }
}
