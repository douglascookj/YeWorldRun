import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BasicEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicEnemy extends Actor
{
    int timer = 80;
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
        int speed = 3;
        if (timer >= 40){
            setLocation(getX(), getY() - speed); 
        }
        else if (timer <= 40){
            setLocation(getX(), getY() + speed);
        }
        if (timer == 0){
            timer = 80;
        }
    }
}
