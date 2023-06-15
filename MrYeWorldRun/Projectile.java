import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (Tyler Moore) 
 * @version (0.1)
 */
public class Projectile extends Actor


{
    public void addedToWorld(World world){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null){
            turnTowards(mouse.getX(), mouse.getY());
        }
    }
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //speed and when its at the edge it deletes
         move(10);

      
        if (isAtEdge() == true){

            getWorld().removeObject(this);
        }
    }
}
