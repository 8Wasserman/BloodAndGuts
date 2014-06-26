import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main playable character.
 * 
 * @Wasserman @ Dykema 
 * @Aplha 1.0
 */
public class Player extends Actor
{
    long lastAdded = System.currentTimeMillis();
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        shoot();
    }  



    public void shoot()
    {
         if (Greenfoot.isKeyDown("space"))
        {
            long curTime = System.currentTimeMillis();
            if(curTime >= lastAdded + 800) 
            {
                getWorld().addObject (new Bullet(), getX(), getY());
                lastAdded = curTime;
                Greenfoot.playSound("awp.wav");
            }
        }
    }
    
    public void movement()
    {
         if (Greenfoot.isKeyDown("left"))
       {
           turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-3);
        }
    }

}

