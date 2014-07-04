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
         // Adds hearts
       
        killCount = 0;
        // Creates new player
        Player player = new Player(); 
        
        // Creates Score + Wave
        /*KillCount score = new KillCount();
        addObject(score, 13, 75);
        waveNumber wave = new waveNumber();
        addObject(wave, 13, 75);*/
        
        // Adds player to world at specified coordinates
        addObject(player, 335, 424); 
        
        // Spawners
        Spawner spawn = new Spawner();
        addObject(spawn, 1266, 704);
        botSpawner botspawn = new botSpawner();
        addObject(botspawn, 1266, 704);
        
        //Puts Kill Count before the number
        score.textOrNo = true;
        addObject(score, 100, 100);
    }
}
