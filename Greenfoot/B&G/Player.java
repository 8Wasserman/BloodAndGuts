import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
* Main playable character
*
* @Author Wasserman and Dykema
* @Version Alpha 1.0
*/
public class Player extends Actor
{
    int health = 100;
    long lastAdded = System.currentTimeMillis();
    public void act() // Main player method
    {
        movement();
        checkClick();
        hitZomb();
        
        Heart heart = new Heart();
        Heart heart2 = new Heart();
        Heart heart3 = new Heart();

        getWorld().addObject(heart, 1248, 32);
        getWorld().addObject(heart2, 1188, 32);
        getWorld().addObject(heart3, 1128, 32);
        
        if(health <= 66)
        {
            getWorld().removeObject(heart3);
        }
        if(health <= 32)
        {
            getWorld().removeObject(heart2);
        }
        if (health <= 0)
        {          
            //getWorld().removeObject(heart); 
            Greenfoot.setWorld(new GameOver());  
            Greenfoot.playSound("DeathSong.wav"); // Plays hit audio
        }
    }
    public void checkClick() // Checks mouse click for shooting
    {
        if(Greenfoot.mouseClicked(null))
        {
            shoot();
        }
    }
    public void shoot() // Shooting method
    {
        long curTime = System.currentTimeMillis();
        if(curTime >= lastAdded + 1250) // Delay between shots
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();  // Initializes mouse
            if (mouse == null)
            {
                return;
            }
            int x = mouse.getX();  // Finds mosue click X
            int y = mouse.getY();  // Finds mouse click Y
            Bullet bullet = new Bullet();  // Creates bullet
            getWorld().addObject(bullet, getX(), getY());// Adds bullet to playable world
            bullet.turnTowards(x, y);  // Sets direction to click
            lastAdded = curTime; // Resets delay timer
            Greenfoot.playSound("Gunshot.wav"); // Plays shot audio
            
        }
    }
    public void movement() // Player movement
    {
        if (Greenfoot.isKeyDown("left") || (Greenfoot.isKeyDown("a"))) // Move left
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right") || (Greenfoot.isKeyDown("d"))) // Move right
        {
            move(4);
        }
        if (Greenfoot.isKeyDown("up") || (Greenfoot.isKeyDown("w"))) // Move up
        {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("down") || (Greenfoot.isKeyDown("s"))) // Move down
        {
            setLocation(getX(), getY() + 4);
        }
    }
     public void hitZomb() // Human takes damage
    {
        Actor zomb;
        zomb = getOneObjectAtOffset(0, 0, Enemy.class); // Detects collision
        if (zomb != null) // IfZomb hasn't been hit already
        {
            health = health - 34;
            zomb.setLocation(getX()+200, getY());
            Greenfoot.playSound("Hit.wav"); // Plays hit audio
        }
    }
}

