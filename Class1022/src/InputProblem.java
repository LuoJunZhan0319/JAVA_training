import java.util.Scanner;  // Needed for the Scanner class

/*
   This program has a problem reading input.
*/

public class InputProblem
{
   public static void main(String[] args)
   {
      String name;   // To hold the user's name
      int age;       // To hold the user's age
      double income; // To hold the user's income
      
      
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the user's age.
      System.out.print("What is your age? ");
      age = keyboard.nextInt();  //����Ʀr������A����L����enter�N�|�Q�ߥX�@���d�b��L��
      
      // Get the user's income
      System.out.print("What is your annual income? ");
      income = keyboard.nextDouble();  //����Ʀr������A����L����enter�N�|�Q�ߥX�@���d�b��L��
      
      // Get the user's name.
      System.out.print("What is your name? ");
      keyboard.nextLine();  //�]���e����enter�Q�ߥX�AnextLine()�@�ݨ��ƥB�S�Oenter�����A�N�����F
      
      //�ҥH�ڭ̦b�[�@�����W�l�i�H�Q��J
      name = keyboard.nextLine();
      
      // Display the information back to the user.
      System.out.println("Hello " + name + ". Your age is " +
                         age + " and your income is $" +
                         income);
   }
}
