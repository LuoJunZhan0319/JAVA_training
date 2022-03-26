/**
   This program demonstrates hierarchical method calls.
*/

public class DeepAndDeeper
{
   public static void main(String[] args)
   {
      System.out.println("I am starting in main."); //1
      deep();                                       //2
      System.out.println("Now I am back in main."); //7
   }

   /**
      The deep method displays a message and then calls
      the deeper method.
   */

   public static void deep()
   {
      System.out.println("I am now in deep.");       //3
      deeper();                                      //4
      System.out.println("Now I am back in deep.");  //6
   }

   /**
      The deeper method simply displays a message.
   */

   public static void deeper()
   {
      System.out.println("I am now in deeper.");     //5
   }
}