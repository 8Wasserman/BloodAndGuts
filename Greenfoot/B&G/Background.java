import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1, false); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player, 335, 424);
        Enemy enemy = new Enemy();
        addObject(enemy, 959, 49);
        Enemy enemy2 = new Enemy();
        addObject(enemy2, 1134, 105);
        Enemy enemy3 = new Enemy();
        addObject(enemy3, 1193, 219);
        Enemy enemy4 = new Enemy();
        addObject(enemy4, 1214, 320);
        Enemy enemy5 = new Enemy();
        addObject(enemy5, 1137, 381);
        Enemy enemy6 = new Enemy();
        addObject(enemy6, 976, 385);

        enemy6.setLocation(1126, 672);
        enemy5.setLocation(1186, 505);
    }
}
