import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MrYe here.
 * 
 * @author (Tyler Moore) 
 * @version (0.2)
 */
public class Player extends Actor
{
    double yspeed = 0;
    boolean jumping = true;
    double gravity = 0.4;
    GifImage ye = new GifImage("Mr. Ye.gif");
    /**
     * Act - do whatever the MrYe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        gif();
        //if touching the obstacle or BasicEnemy it will call on the hit obstacle method
        if (isTouching(BasicEnemy.class)){

            hitObstacle();

        }
        if (isTouching(Obstacle.class)){

            hitObstacle();

        }
        //movement
        if (Greenfoot.isKeyDown("d")){
            move(5);

        }
        if (Greenfoot.isKeyDown("a")){
            move(-5);

        }
        //gravity and floor code
        if (Greenfoot.isKeyDown("space") && jumping == false){
            yspeed = -16;
            jumping = true;

        }
        yspeed = yspeed + gravity;
        setLocation(getX(), getY() + (int)yspeed);

        if (isTouching(Ground.class)){
            yspeed = 0;
            jumping = false;

        } 

    }

    public void gif(){
        setImage(ye.getCurrentImage());

    }

    public void hitObstacle(){
        //getting healthbar object from backgroun world to use it here
        World myWorld = getWorld();
        Background background = (Background)myWorld;
        HealthBar healthbar = background.getHealthBar();
        //calls the losehealth method in the healthbar
        healthbar.loseHealth();
        removeTouching(Obstacle.class);
        if (isTouching(BasicEnemy.class)){
            removeTouching(BasicEnemy.class);}
    }
}

