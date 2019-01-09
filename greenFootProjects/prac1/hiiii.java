import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hiiii here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hiiii extends Actor
{
    private int speed;
    
    public hiiii()
    {
      this.speed = 1;
        
    }
     public hiiii(int speed)
    {
        this.speed = speed;
        
    }
            
    public void act() 
    {
        // Add your action code here.
        move(this.speed);
        if(isAtEdge()){
            turn(10);
        }
        getWorld().showText(""+this.getX(),200,200);
    }    
}
