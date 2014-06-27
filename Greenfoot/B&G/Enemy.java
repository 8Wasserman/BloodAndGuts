import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        moveIt();
        followHuman();
        aiattack();
        kaboom();
   
    
    
    }  
  
   public boolean atWorldEdge()  
    {  
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)  
            return true;  
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)  
            return true;  
        else  
            return false;  
    } 
     public void moveIt()
    {
        move(2);
        if( atWorldEdge())
        {
            turn(5);
        }
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


    

public void followHuman()  // AI movement towards player
    {  
        String target;
        
        getObjectsInRange(1280, Player.class);
          
          int targetX = getX();
          int targetY = getY();
        }     
     
public void kaboom() //Enemy death my bullet
{
    Actor bull = getOneIntersectingObject(Bullet.class); // Get bullet
    if (bull != null) // If Bullet Exists
    {  
        getWorld().removeObject(bull); // Removes Bullet 
        getWorld().removeObject(this); // Removes Monster
    }  
}  

}