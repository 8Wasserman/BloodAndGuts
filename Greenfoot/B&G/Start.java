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

        removeObject(mapchanger);
        removeObject(mapchanger2);
        MapChanger mapchanger3 = new MapChanger();
        addObject(mapchanger3, 1262, 704);
        mapchanger3.setLocation(1099, 303);
        MapChanger mapchanger4 = new MapChanger();
        addObject(mapchanger4, 173, 314);
        mapchanger3.setLocation(1093, 308);
        mapchanger3.setLocation(1100, 308);
    }
}
