import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MrYe here.
 * 
 * @author (Tyler Moore) 
 * @version (0.1)
 */
public class Player extends Actor
{
    double vspeed = 0;
    boolean jumping = true;
    double gravity = 0.7;
    /**
     * Act - do whatever the MrYe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //movement
        if (Greenfoot.isKeyDown("d")){
            move(5);

        }
        if (Greenfoot.isKeyDown("a")){
            move(-5);

        }
        //gravity and floor code
        if (Greenfoot.isKeyDown("space") && jumping == false){
            vspeed = -12;
            jumping = true;

        }
        vspeed = vspeed + gravity;
        setLocation(getX(), getY() + (int)vspeed);
        if (isTouching(floor.class)){
            vspeed = 0;
            jumping = false;

        } 

    }
}

