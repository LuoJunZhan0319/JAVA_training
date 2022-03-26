public class SubClass2 extends SuperClass2
{
   /**
      Constructor
   */

   public SubClass2()
   {
      super(10);							//呼叫父類別建構式
      System.out.println("This is the " +
                 "subclass constructor.");
   }
}