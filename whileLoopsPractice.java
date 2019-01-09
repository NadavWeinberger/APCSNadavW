import javax.swing.JOptionPane;

public class whileLoopsPractice
{
  
    public static void mainwhileLoopsPractice()
    {
       int age = Integer.parseInt(JOptionPane.showInputDialog("age.now."));
       while (age < 0 || age > 120)
       {
          
           System.out.println("Try again");
           age = Integer.parseInt(JOptionPane.showInputDialog("age.now."));
           
       }
       System.out.println("Thanks");
    }
}
