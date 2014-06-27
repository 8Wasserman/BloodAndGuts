import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**Adjust bullet speed, location, and shoot method
 * 
 * 
 * @author Wasserman & Dykema
 * @version Alpha 1.0
 */
public class Bullet extends Actor
{
    public void act() 
    {
        setLocation(getX(), getY()-5); //Location of bullet creation
        move(20); // Bullet Speed
        Shoot();
    }    

    public void Shoot()
    {

    }
}
