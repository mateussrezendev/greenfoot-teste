import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro0 extends World
{
    GifImage myGif = new GifImage("intro.gif");
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro0()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void act(){
        setBackground(myGif.getCurrentImage());
        //Dialogo 1
        if (Greenfoot.isKeyDown("enter")) {
            intro1 world = new intro1();
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}