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
          Scanner inputFile = new Scanner(new File("hello.txt"));	//有些類別的例外是java很care的!所以你用try_catch時要抓精準，要不然會錯!
       }
       catch (FileNotFoundException e)
       {
          System.out.println("File access error: " +
                             e.getMessage());
       }
   }
}