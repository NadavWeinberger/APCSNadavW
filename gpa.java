import javax.swing.JOptionPane;
public class gpa
{
     public static void main() {
            
           String gp = JOptionPane.showInputDialog("enter GPA");
            float gpa = Float.parseFloat(gp);
            
            if (gpa > 4.0)
                {
                   System.out.println("u took ap");   
                }
             else if (gpa > 0)
                {
                    System.out.println("noice");
                }
              else
              {
                  System.out.println("impossible.");
               }
        
             
             
            }    
}
