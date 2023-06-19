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
    private int timer = 0;
    private int antiSpamCounter;
    private int antiSpamCounterTwo;
    private static final String bgImageName = "lvl1bg.jpg";
    public static final double scrollSpeed = 6;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();

    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;

    Player player = new Player();
    PlayerArm playerArm = new PlayerArm();

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

        addObject(player, 100, 400);
        addObject(playerArm, 100, 400);

    }

    public void act()
    {
        timer++;
        antiSpamCounter++;
        antiSpamCounterTwo++;
        showText("" + timer / 60, 30, 30);
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);

        //sets location for arm(arm tracks player)
        int gX = player.getX();
        int gY = player.getY();
        playerArm.setLocation(gX + 13,gY - 8);

        if (timer / 60 % 4==0 && antiSpamCounter > 60){
            addObject(getRandomObstacle(), 1000, 450);

            antiSpamCounter = 0;
        }
        if (timer / 60 % 4==0 && antiSpamCounterTwo > 60){
            addObject(new BasicEnemy(), 500, 250);

            antiSpamCounterTwo = 0;
        }

    }

    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }

    private Obstacle getRandomObstacle(){
        Obstacle o = new Obstacle();
        int x = Greenfoot.getRandomNumber(3);

        if (x == 0){
            o = new Bush();
        }
        if (x == 1){
            o = new Rock();
        }
        if (x == 2){
            o = new Desk();
        }
        return o;
    }
    
    public int getTimer(){
        return timer;
    }
}
