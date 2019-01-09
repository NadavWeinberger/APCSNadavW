import javax.swing.JOptionPane;

public class testPrac
{
    
    public static void askForName()
    {
        String name = JOptionPane.showInputDialog("What's your name?").toLowerCase();
        
        if (name.equals("ahmad"))
        {
            System.out.println("Hi Ahmad");
            
            
        }
        else 
        {
            System.out.println("I don't know you, " + name);
            
            
            
        }
        askForName();
        
        
    }
    
    public static void askForAge()
    {
       int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
       
       if (age < 20 && age > 12)
       {
           System.out.println("what a great age!");
           
                 
           
        }
        else
        {
            System.out.println("You're too young/old!");
            
            
        }
       askForAge();
       
       
       
    }

    
    
    
    
}