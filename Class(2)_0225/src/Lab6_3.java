import java.util.Scanner;
public class Lab6_3
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please input a number");
      int number = keyboard.nextInt();

      if(isPositive(number))
        System.out.println("�o�O�����");
      else
         System.out.println("�o���O�����");
   }

   public static boolean isPositive(int i)
   {
      if(i > 0)
         return true;
      else
         return false;
   }
}