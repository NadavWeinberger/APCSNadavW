import javax.swing.JOptionPane;

public class WhereIsMJ
{
    
    public static void WhereIsMJ()
    {
      String school = JOptionPane.showInputDialog("What school do u go to?");
      String mascot = JOptionPane.showInputDialog("What's your school mascot?");
      
      if ((!"Granada".equals(school)) && (!"Matadors".equals(mascot)))
      {
          System.out.println("Both the school and mascot are incorrect");
      }
      else if (!"Granada".equals(school) && ("Matadors".equals(mascot)))
      {
          System.out.println("The school is incorrect");
      }
      else if ("Granada".equals(school) && (!"Matadors".equals(mascot)))
      {
          System.out.println("The mascot is incorrect");
      }        
      else
      {
          String[] artists = new String[5]; 
          artists [0] = "Rick Astley";
          artists [1] = "Mozart";
          artists [2] = "Michael Jackson";
          artists [3] = "Drake";
          artists [4] = null;
          String ourFavorite = "Michael Jackson";
          
          
          for (int i = 0; i < artists.length;i++)
          {     
              if(artists[i]== null)
              {
                 System.out.println("Element #" + (i+1) + " is empty.");
                 
              }
              else if (artists[i].equals("Michael ahgsdjh"))
              {
                   
                   System.out.println("We didn't find him. Element #" + (i+1) + " is " + artists[i]);
              }
             
             
             
              else
              {
                 
                 System.out.println("We found him. Element #" + (i+1) + " is Michael Jackson.");

              }
      }
      String favoriteArtist = JOptionPane.showInputDialog("What is your favorite artist?");
      if(ourFavorite.equals(favoriteArtist))
      {
        System.out.println("We have the same favorite artist");
      }
      else
      {
        System.out.println("We have the different favorite artists");
        
      }
        
        
        
    }

}
}