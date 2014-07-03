import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns zombies on botton
 * 
 * @author Wasserman & Dykema
 * @version Alpha 1.0
 */
public class botSpawner extends Actor
{
    public void act() 
    {
        spawn();
    } 
    public void spawn()
    {
        if(Greenfoot.getRandomNumber(150) == 1)
        {
            getWorld().addObject(new Enemy(), Greenfoot.getRandomNumber(getWorld().getWidth()), 720);
        }
    }
}
