import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerArm here.
 * 
 * @author (Tyler Moore) 
 * @version (0.1)
 */
public class PlayerArm extends Actor
{
    int antiSpamCounter = 0;
    /**
     * Act - do whatever the PlayerArm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Projedctile shoot code and arm rotation/curser tracking
        antiSpamCounter++;
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null){
            //rotates toward curser
            int mouseX = mouse.getX();
            int mouseY = mouse.getY();
            turnTowards(mouseX, mouseY);
            //adds projectile
            if (mouse.getButton() == 1 && antiSpamCounter > 30){
                int rotation = getRotation();
                getWorld().addObject(new Projectile(), getX(), getY());
                antiSpamCounter = 0;
            }
        }
    }
}
