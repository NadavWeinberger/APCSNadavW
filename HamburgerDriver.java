
public class HamburgerDriver
{
   public static void main()
   {
       //make one instance/object of Hamburger class
     Hamburger hamburger1 = new Hamburger(true,13,"Nadav Cheese");
     Hamburger hamburger2 = new Hamburger(false,55000,"");
     Hamburger hamburger3 = new Hamburger();
       // print the toStriung of the object
     System.out.println(hamburger1.toString());
     System.out.println(hamburger2.toString());
     System.out.println(hamburger3.toString());
     
       
    }
}
