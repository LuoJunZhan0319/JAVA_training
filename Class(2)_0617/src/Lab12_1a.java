import java.io.*;               // For file I/O classes
import java.util.Scanner;
public class Lab12_1a
{
   public static void main(String[] args)
   {
       String str = "abcde";
       int number;

       try
       {
          Scanner inputFile = new Scanner(new File("hello.txt"));	//�������O���ҥ~�Ojava��care��!�ҥH�A��try_catch�ɭn���ǡA�n���M�|��!
       }
       catch (FileNotFoundException e)
       {
          System.out.println("File access error: " +
                             e.getMessage());
       }
   }
}