import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rainbow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rainbow extends Actor
{
    /**
     * Act - do whatever the rainbow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    public void moveAtaque() {
        double angle = Math.toRadians(getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
    public void acertarAlvo() {
        
        Actor a = getOneIntersectingObject(Dipper.class);
        
        if (a != null){
            
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
        
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }
    }
}
