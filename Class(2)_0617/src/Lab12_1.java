import java.io.*;               // For file I/O classes
public class Lab12_1
{
   public static void main(String[] args)
   {
       String str = "abcde";
       int number;

       try
       {
          number = Integer.parseInt(str);
       }
       catch (IndexOutOfBoundsException e)				//java�������A�H�N�ç�ҥ~�A�������ˬd���ҥ~java�����care!!
       {
          System.out.println("Conversion error: " +
                             e.getMessage());
       }
   }
}