import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
* Enemy AI Motion, Death by bullet detection and attack player methods.
*
* @author Wasserman and Dykema
* @version Alpha 1.0
*/
public class Enemy extends Actor
{
    public void act() //Main enemy class
    {
        int dist = 1000;
        Actor closest = null;
        if(!getObjectsInRange(dist, Player.class).isEmpty())
        {
            for (Object obj: getObjectsInRange(dist, Player.class))
            {
                Actor Player = (Actor) obj;
                int playerDist = (int) Math.hypot(Player.getX() - getX(), Player.getY() - getY());
                if (closest == null || playerDist < dist)
                {
                    closest = Player;
                    dist = playerDist;
                }
            }
            turnTowards(closest.getX(),closest.getY()); // Sets rotation towards player
            move(2);
            setRotation(0);
        }
        aiattack();
        kaboom();
    }
    public void aiattack() // Attacks human (Removes object until health added)
    {
        Actor Person;
        Person = getOneObjectAtOffset(0, 0, Player.class); // Detects collision
        if (Person != null) // If person exists
        {
            World world;
            world = getWorld();
            world.removeObject(Person); // Removes object (Player)
        }
    }
    public void kaboom() //Enemy death by bullet
    {
        Actor bull = getOneIntersectingObject(Bullet.class); // Get bullet
        if (bull != null) // If Bullet Exists
        {
            getWorld().removeObject(bull); // Removes Bullet
            getWorld().removeObject(this); // Removes Enemy
        }
    }
}