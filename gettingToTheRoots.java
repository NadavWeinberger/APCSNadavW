import javax.swing.JOptionPane;
import java.lang.Math;


/**
 * Write a description of class gettingToTheRoots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gettingToTheRoots
{
  public static void main()
  
  {
   double a = Double.parseDouble(JOptionPane.showInputDialog("enter the coefficient of x^2")); 
   double b = Double.parseDouble(JOptionPane.showInputDialog("enter the coefficient of x"));
   double c = Double.parseDouble(JOptionPane.showInputDialog("enter the constant"));
   double bob = b*b;
   double blob = 4*a*c;
   double cornonthecob = Math.sqrt(bob-blob);
   
  
   System.out.println("The value of b^2 = " + bob);
      
   System.out.println("The value of 4*a*c  = " + blob);
   
   if (cornonthecob < 0)
   {
       System.out.println("imaginary answers");
   }
   else
   {
   System.out.println("The value of the radicand is = " + cornonthecob);
   
   System.out.println("The first root of the equation = " + ((-b + cornonthecob)/(2*a)));
   
   System.out.println("The second root is = " + ((-b - cornonthecob)/(2*a)));
   }
   
  }
    
    
    
    
}

//System.out.println