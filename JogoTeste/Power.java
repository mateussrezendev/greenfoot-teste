import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Power here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Power extends Actor
{
    public int temp = 20;
    /**
     * Act - do whatever the Power wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    public void moveAtaque() {
        double angle = Math.toRadians(getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));
        
        setLocation(x, y);
    }
    public void acertarAlvo() {
        
        Actor b = getOneIntersectingObject(Mabel.class);
        temp--;
        if (b != null){
            
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
        if(temp < 1){
           dipperwins world = new dipperwins();
           Greenfoot.setWorld(world);
            getWorld().removeObject(b);
            getWorld().removeObject(this);
        }
        }
    }
}
