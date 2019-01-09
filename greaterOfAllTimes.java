import javax.swing.JOptionPane;

public class greaterOfAllTimes
{
    public static void greaterOfAllTimes()
    {
       int size = 0;
       int min = 10;
       int max = 100;
       int greatest = min;
       int lowest = max;
       while (size < 10 || size > 100)
            size = Integer.parseInt(JOptionPane.showInputDialog("Select an array size between 10 and 20"));
        
       int [] myArray = new int[size]; 
       
       for(int i = 0; i < size; i++)
            myArray[i] =(int)(((Math.random()*(max-min))+min)+1);
            
       for (int i = 0; i < size; i++)
            System.out.print(myArray[i] + " ");
            
       for (int temp = 0; temp < size; temp ++)
           { if (myArray[temp] >= greatest)
                greatest = myArray[temp];
            if (myArray[temp] <= lowest)
                lowest = myArray[temp];
            }
       System.out.println("\ngreatest: " + greatest);
       System.out.println("lowest: " + lowest);
            
       
    }
}
