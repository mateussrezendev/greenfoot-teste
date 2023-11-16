import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mabel extends Actor
{
 private int speed = 3;
    
    /**
     * Act - do whatever the Dipper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    
    GreenfootSound power = new GreenfootSound("power.wav");
    
    private int sTimer = 0;
    
    public void movimento(){ 
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed) ;
    }
        if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed) ;
    }
        if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY()) ;
    }
        if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY()) ;
    }
        else if (Greenfoot.isKeyDown("space") && (sTimer == 0)){
            sTimer ++;
            power.play();
            getWorld().addObject(new rainbow(), getX() +100, getY() +30);
        }else{
            if (!Greenfoot.isKeyDown("space")){
                sTimer = 0;
            }
        }
    }
}
