import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasicEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicEnemy extends Actor
{
    /**
     * Act - do whatever the BasicEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();        
    }

    public void movement(){
        int min = 120;
        int max = 120;
        double y = min + Math.random() * (max - min);
        int speed = (int) y;
        setLocation(getX(), getY() + speed); 
    }
}
