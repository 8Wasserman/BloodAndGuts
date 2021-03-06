import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Randomly Spawns enemies at edges
 * 
 * @author Wasserman & Dykema
 * @version Alpha 1.0
 */
public class Spawner extends Actor
{
    public static int spawnRate = 125;
    /**
     * Act - do whatever the spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        spawn();
    }    
    public void spawn()
    {
        if(Greenfoot.getRandomNumber(spawnRate) == 1)
        {
            getWorld().addObject(new Enemy(), Greenfoot.getRandomNumber(getWorld().getWidth()), 46);
        }
    }
}
