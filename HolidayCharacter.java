
public class HolidayCharacter
{
   private String name;
   private boolean isNice;
   private int fansNum;
   
   public HolidayCharacter()
   {
       this.name = null;
       this.isNice = false;
       this.fansNum = 0;
       
    }
    
   public HolidayCharacter(String name, boolean isNice, int fansNum)
   {
       this.name = name;
       this.isNice = isNice;
       this.fansNum = fansNum;
       
   }
   
   public String toString()
   {
      String output = "Name: " + this.name +"\nIs the chracter nice: " + this.isNice + "\nNumber of fans: " + fansNum;
      return output; 
    }
    
}
