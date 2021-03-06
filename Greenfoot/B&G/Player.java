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
    int speed = 4;
    int shootingSpeed = 900;
    long lastAdded = System.currentTimeMillis();
    Heart heart = new Heart();
    Heart heart2 = new Heart();
    Heart heart3 = new Heart();
    boolean spawnHearts = true;
        
    public void act() // Main player method
    { 
        if(spawnHearts)
        {
            getWorld().addObject(heart, 1214, 84);
            getWorld().addObject(heart2, 1160, 84);
            getWorld().addObject(heart3, 1106, 84);
        }
        spawnHearts = false;
        
        hitZomb();
        
        if (health <= 66 && health > 32)
        {
            getWorld().removeObject(heart3);
        }
        
        if (health <= 32 && health > 0)
        {
            getWorld().removeObject(heart2);
        }
        
        if (health <= 0)
        {      
            getWorld().removeObject(heart);
            Greenfoot.setWorld(new GameOver());  
            Greenfoot.playSound("DeathSong.wav"); // Plays hit audio
        }
        movement();
        checkClick();

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
        if(curTime >= lastAdded + shootingSpeed) // Delay between shots
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
            move(-speed);
        }
        if (Greenfoot.isKeyDown("right") || (Greenfoot.isKeyDown("d"))) // Move right
        {
            move(speed);
        }
        if (Greenfoot.isKeyDown("up") || (Greenfoot.isKeyDown("w"))) // Move up
        {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("down") || (Greenfoot.isKeyDown("s"))) // Move down
        {
            setLocation(getX(), getY() + speed);
        }
        if(getY() < 46)
        {
            setLocation(getX(), 46);
        }
        if(getY() > 656)
        {
            setLocation(getX(), 656);
        }
        if(getX() < 46)
        {
            setLocation(46, getY());
        }
        if(getX() > 1234)
        {
            setLocation(1234, getY());
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

