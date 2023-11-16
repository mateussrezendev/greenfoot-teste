import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In this game, you'll have the most fun in your entire life in less then 10 minutes.
 * 
 * @MateusRezendev
 * @version 0.1 Alpha
 */
public class MyWorld extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("gravitysong.mp3");
        public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dipper dipper = new Dipper();
        addObject(dipper,172,409);
        Mabel mabel = new Mabel();
        addObject(mabel,329,412);
        Counter counter = new Counter();
        addObject(counter,641,42);
        Counter counter2 = new Counter();
        addObject(counter2,126,64);
        counter2.setLocation(125,55);
        counter.setLocation(672,54);
        removeObject(counter2);
        mabel.setLocation(612,431);
    }
}
