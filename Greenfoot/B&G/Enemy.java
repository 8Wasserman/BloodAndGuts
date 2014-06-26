import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        followHuman();
        aiattack();
        kaboom();
    }  
    
    public void aiattack()
{
                 Actor Person;
        Person = getOneObjectAtOffset(0, 0, Player.class);
            if (Person != null)
    {
        World world;
        world = getWorld();
        world.removeObject(Person);
    }
}    

public void followHuman()  
    {  
        int dist = 1000;  
        Actor closest = null;  
          
        if(!getObjectsInRange(dist, Player.class).isEmpty())  
        {  
        for (Object obj: getObjectsInRange(dist, Player.class))  
        {  
       
            Actor Player = (Actor) obj;  
            move(2);
            int playerDist = (int) Math.hypot(Player.getX() - getX(), Player.getY() - getY());  
            if (closest == null || playerDist< dist)  
            {  
                    closest = Player;  
                    dist = playerDist;  
            }  
        }  
        turnTowards(closest.getX(),closest.getY());  
        }     
    }  
public void kaboom() {  
    Actor bull = getOneIntersectingObject(Bullet.class); // get bullet  
    if (bull != null) // is bullet there  
    {  
        getWorld().removeObject(bull); // remove bullet  
        getWorld().removeObject(this); // remove monster  
    }  
}  

}