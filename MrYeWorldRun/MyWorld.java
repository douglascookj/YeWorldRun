import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Tyler Moore) 
 * @version (0.2)
 */
public class MyWorld extends World
{
    //creates a player and playerarm object so we can use them here
    Player player = new Player();
    PlayerArm playerArm = new PlayerArm();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        addObject(player, 100, 500);
        addObject(playerArm, 100, 500);
        addObject(new floor(), 500, 780);
    }

    public void act(){
        //sets location for arm(arm tracks player)
        int gX = player.getX();
        int gY = player.getY();
        playerArm.setLocation(gX + 13,gY - 8);
    }
}
