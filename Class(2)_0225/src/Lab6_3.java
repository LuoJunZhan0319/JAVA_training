import java.util.Scanner;
public class Lab6_3
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please input a number");
      int number = keyboard.nextInt();

      if(isPositive(number))
        System.out.println("這是正整數");
      else
         System.out.println("這不是正整數");
   }

   public static boolean isPositive(int i)
   {
      if(i > 0)
         return true;
      else
         return false;
   }
}