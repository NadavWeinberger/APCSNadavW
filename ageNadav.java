import javax.swing.JOptionPane;


public class ageNadav
{
   
    
    String age = JOptionPane.showInputDialog("age.now.");
    int ageage = Integer.parseInt( age );
    if (ageage >= 16) {
        
        System.out.println("u can drive!");
    }
    else {
    System.out.println("u can't drive!");
    String yn = JOptionPane.showInputDialog("do you want to drive?");

    if (yn.equals("yes")){
    System.out.println("too bad. Better luck in "+ 16 - ageage +" years");
    }
}

    }
}
   

