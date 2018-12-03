import javax.swing.JOptionPane;


public class InputOutput
{
    public static void main() {
    
       
        String user = JOptionPane.showInputDialog("username.now.");

        
        if (user.equals("Nadav"))
        {
          String pass = JOptionPane.showInputDialog("password.now.");
          if (pass.equals("is stupid"))
          {
              System.out.println("smart");
          }
          if (pass.equals("is smart"))
          {
              System.out.println("no he is dumb");
          }
          else{
              System.out.println("wrong password");
            }
            }
        else {
         System.out.println("Wrong username.");   
            
        }
        //System.out.println(name + " is really stupid");
        
    
    }
}
