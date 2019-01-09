import javax.swing.JOptionPane;

public class FibonacciFun
{
    public static void main()
    {
        int numFib =Integer.parseInt( JOptionPane.showInputDialog("How many Fibonacci numbers do you want?"));
        
        int[] numbers = new int[numFib];
        
        for (int i = 1; i< numbers.length; i++)
        {
            numbers[i] = i;
             
        }
        
        int[] fibonacci = new int[numFib];
        fibonacci [0] = 0;
        fibonacci [1] = 1;
        
        for (int i=2; i<fibonacci.length; i++)
        {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
  
        }
            
        System.out.println("Index \t Fib Num. \tRunning Total");
 
        
        int total = 0;
        for (int i =0; i<numFib; i++)
        {
            total += fibonacci[i];
            
            System.out.println(numbers[i]+1 +"\t " + fibonacci[i] +"\t \t" +total);
            
             
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
