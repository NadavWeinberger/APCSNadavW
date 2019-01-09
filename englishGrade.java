import javax.swing.JOptionPane;

public class englishGrade
{
    
    public static void englishGrade()
    {
        int grade = Integer.parseInt(JOptionPane.showInputDialog("What's your grade?"));
        
        while (grade<0 || grade>100)
        {
             grade = Integer.parseInt(JOptionPane.showInputDialog("invalid grade"));
            
        }
        
        if (grade < 60)
                System.out.println("you have an F");
        else if (grade < 70)
                System.out.println("you have a D");
        else if (grade < 80)
                System.out.println("you have a C");
        else if (grade < 90)
                System.out.println("you have a B");
        else
                System.out.println("you have an A");
        
        
            
            }
        
}
