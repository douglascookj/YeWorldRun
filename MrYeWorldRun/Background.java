import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class Background extends World
{

    private static final String bgImageName = "lvl1bg.jpg";
    public static final double scrollSpeed = 6;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();

    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;

    Player player = new Player();
    PlayerArm playerArm = new PlayerArm();

    Bush bush = new  Bush();

    HealthBar healthBar = new HealthBar();

    public HealthBar getHealthBar(){
        return healthBar;
    }

    public Background()
    {    
        super(1000, 600, 1);
        addObject(healthBar, 200, 40);
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);

        addObject(new Ground(), 500, 500);
        addObject(bush, 700, 500);
        addObject(player, 100, 500);
        addObject(playerArm, 100, 500);

    }

    public void act()
    {
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);

        //sets location for arm(arm tracks player)
        int gX = player.getX();
        int gY = player.getY();
        playerArm.setLocation(gX + 13,gY - 8);

    }

    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
}
