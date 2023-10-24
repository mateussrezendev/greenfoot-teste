import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro2 extends intro0
{
    GifImage myGif = new GifImage("mabel.gif");

    /**
     * Constructor for objects of class intro2.
     * 
     */
    public intro2()
    {
    }
    
    public void act(){
        setBackground(myGif.getCurrentImage());
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter")){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
