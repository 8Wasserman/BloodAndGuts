import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main playable character
 * 
 * @Author Wasserman and Dykema
 * @Version Alpha 1.0
 */
public class Player extends Actor
{
    long lastAdded = System.currentTimeMillis();
    
    public void act() // Main player method
    {
        movement();
        shoot();
    }  



    public void shoot() // Shooting method
    {
         if (Greenfoot.isKeyDown("space")) // Checks if spacebar is pressed
        {
            long curTime = System.currentTimeMillis(); 
            if(curTime >= lastAdded + 800) // Delay between shots
            {
                Bullet b = new Bullet(); // Creates bullet
                getWorld().addObject (b, getX(), getY()); // Adds bullet to world
                b.setRotation(getRotation()); // Sets bullet direction
                lastAdded = curTime; // Resets delay timer
                Greenfoot.playSound("awp.wav"); // Plays shot audio
            }
        }
    }
    
    public void movement() // Player movement
    {
         if (Greenfoot.isKeyDown("left")) // Turn left
       {
           turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) // Turn right
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up")) // Move up
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("down")) // Move down
        {
            move(-3);
        }
    }

}

