public class SubClass1 extends SuperClass1
{
   /**
      Constructor
   */

   public SubClass1()
   {
	   
	  super();                           //在子類別當中JAVA會幫你預設父類別建構式								
      System.out.println("This is the " +
                 "subclass constructor.");
   }
}
