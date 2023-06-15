import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (Tyler Moore) 
 * @version (0.1)
 */
public class HealthBar extends Player
{
    int health = 3;
    int healthBarWidth = 80;
    int healthBarHeight = 15;
    int pixlesPerHealthPoint = (int)healthBarWidth/health;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        update();
    }
    public void update(){
        setImage (new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
    }
}
