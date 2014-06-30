import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
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
        move(20); // Bullet Speed
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
    public void kaboom() // Bullet Clearing
    {
        if (atWorldEdge()) // If Bullet Contacts Boundary
        {
            getWorld().removeObject(this);
            // Removes Bullet
        }
    }
}