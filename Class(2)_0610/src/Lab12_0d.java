import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Lab12_0d
{
   public static void main(String[] args) throws IOException
   {
	   try		//要讓系統知道試試看這裡，因為它有可能會出錯。 
	   {
		   File f = new File("test.txt");
		   Scanner keyboard = new Scanner(f);		//FileNotFoundException is-a IOException
	   }
	   catch(FileNotFoundException e)
	   {
		   System.out.println(e.getMessage());
		   System.out.println("Hello World");
	   }
	   
//       String line1 = keyboard.nextLine();
//       String line2 = keyboard.nextLine();
//       String line3 = keyboard.nextLine();
//       String line4 = keyboard.nextLine();
//       String line5 = keyboard.nextLine();
//       String line6 = keyboard.nextLine();
//       String line7 = keyboard.nextLine();
//       String line8 = keyboard.nextLine();
   }
}