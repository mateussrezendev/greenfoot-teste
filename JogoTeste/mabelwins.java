import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mabelwins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mabelwins extends intro0
{
  public int temp = 20;
    public int temp1 = 20;
    /**
     * Constructor for objects of class mabelwins.
     * 
     */
    public mabelwins()
    {
    }
    public void act(){
    temp--;
    if (Greenfoot.isKeyDown("enter") && (temp < 1)) {
           setBackground(new GreenfootImage("dippergameover.png"));
           temp1--;
        }
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)) {
            intro0 world = new intro0();
            Greenfoot.setWorld(world);
        }
}
}