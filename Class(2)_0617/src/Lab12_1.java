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
       catch (IndexOutOfBoundsException e)				//java不接受你隨意亂抓例外，但不用檢查的例外java比較不care!!
       {
          System.out.println("Conversion error: " +
                             e.getMessage());
       }
   }
}