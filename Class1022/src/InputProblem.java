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
      age = keyboard.nextInt();  //指對數字有興趣，由鍵盤打的enter就會被拋出一直留在鍵盤中
      
      // Get the user's income
      System.out.print("What is your annual income? ");
      income = keyboard.nextDouble();  //指對數字有興趣，由鍵盤打的enter就會被拋出一直留在鍵盤中
      
      // Get the user's name.
      System.out.print("What is your name? ");
      keyboard.nextLine();  //因為前面的enter被拋出，nextLine()一看到資料且又是enter結尾，就結束了
      
      //所以我們在加一行讓名子可以被輸入
      name = keyboard.nextLine();
      
      // Display the information back to the user.
      System.out.println("Hello " + name + ". Your age is " +
                         age + " and your income is $" +
                         income);
   }
}
