import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    public static KillCount score = new KillCount();
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
       
        //Makes sure "Kill Count" does print before the number
        score.textOrNo = false;
        addObject(score, 709, 441);
    }
    
    /**
     Will allow the player to either go to the main or restart
     */
     private void prepare()
    {
        restart doover = new restart();
        addObject(doover, 300, 500);
        escListener esclistener = new escListener();
        addObject(esclistener, 989, 500);
    }
}
