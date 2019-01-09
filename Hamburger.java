
public class Hamburger
{
    //this is a class called Hamburger
    //from this class we can make as many Hamburger instances/objects as we want
    
    //instance variables
    private boolean hasLettuce;
    private int numPatties;
    private String cheeseType;
    
    //zero-argument constructor
    //runs every time a zero-arg Hamburger is made
    //always named public className
    public Hamburger()
    {
        
        this.hasLettuce = false; //sets all instance 
        this.numPatties = 0;     //variables to generic values
        this.cheeseType = null;
        
    }
    //toString method
    public String toString()
    {
        String output = "Has lettuce: " + this.hasLettuce+"\nPatties: "+this.numPatties +"\ncheese type: " 
        + this.cheeseType;
        
        return output;
    }
    
    //multi-arg constructor
    public Hamburger(boolean hasLettuce, int numPatties, String cheeseType)
    {
        this.hasLettuce = hasLettuce;  //set instance variables to the parameter/argument variables
        this.numPatties = numPatties;  //
        this.cheeseType = cheeseType;  //
        
        
        
    }
}
