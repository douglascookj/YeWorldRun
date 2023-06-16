import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (Tyler Moore) 
 * @version (0.1)
 */
public class HealthBar extends Player
{
    //health amount, size of health bar, and how many pixels per amount of health
    int health = 4;
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar(){
        update();
    }

    public void act()
    {
        update();
    }

    public void update(){
        //sets healthbar image and sets it to the size we want from the variables
        setImage (new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.RED);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);

    }

    public void loseHealth(){
        health--;

    }
}
