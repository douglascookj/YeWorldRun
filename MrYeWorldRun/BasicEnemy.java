import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasicEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicEnemy extends Actor
{
    int timer = 100;
    /**
     * Act - do whatever the BasicEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement(); 
        timer--;
        
    }

    public void movement(){
        int min = 0;
        int max = 20;
        double y = min + Math.random() * (max - min);
        int speed = (int) y;
        
        if (timer >= 50){
            setLocation(getX(), getY() - speed); 

        }
        else if (timer <= 50){
            setLocation(getX(), getY() + speed);
            
        }
        
    }
}
