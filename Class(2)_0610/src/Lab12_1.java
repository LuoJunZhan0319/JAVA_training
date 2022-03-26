import java.io.*;               // For file I/O classes
public class Lab12_1
{
   public static void main(String[] args)
   {
       String str = "abcde";
       int number;

       try
       {
          number = Integer.parseInt(str);			//©ß¥XNumberFormatException
       }
       catch (Exception e)				//®·®»ArithmeticException(µL½sÄ¶¿ù»~)
       {
          System.out.println("Conversion error: " +
                             e.getMessage());
       }
       
//       catch (FileNotFoundException e)				//®·®»FileNotFoundException(¦³½sÄ¶¿ù»~)
//       {
//    	   
//       }
       

   }
}