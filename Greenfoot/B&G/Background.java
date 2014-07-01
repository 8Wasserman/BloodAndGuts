import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Playable world including enemies and player.
 * 
 * @author Wasserman and Dykema
 * @version Alpha 1.0
 */
public class Background extends World
{
    //Holds score
    public static int killCount = 0;
    public static KillCount score = new KillCount();
    public Background()
    {    
        // Create a world with dimensions 1280 by 720 cells with a cell size of 1 pixel
        super(1280, 720, 1); 

        prepare(); // Method containing world layout.
    }

    /**
     * Prepare the world for the start of the program.
     * Creates initial objects and adds them to the world.
     */
    private void prepare()
    {
        killCount = 0;
        // Creates new player
        Player player = new Player(); 
        
        // Creates Score + Wave
        KillCount score = new KillCount();
        addObject(score, 13, 75);
        waveNumber wave = new waveNumber();
        addObject(wave, 13, 75);
        
        //Creates enemies
        Enemy enemy = new Enemy(); 
        Enemy enemy2 = new Enemy(); 
        Enemy enemy3 = new Enemy(); 
        Enemy enemy4 = new Enemy(); 
        Enemy enemy5 = new Enemy(); 
        Enemy enemy6 = new Enemy();
        
        // Adds objects to world at specified coordinates
        addObject(player, 335, 424); 
        addObject(enemy, 959, 49);
        addObject(enemy2, 1134, 105);
        addObject(enemy3, 1193, 219); 
        addObject(enemy4, 1214, 320);
        addObject(enemy5, 1137, 381);
        addObject(enemy6, 976, 385);
    }
}
