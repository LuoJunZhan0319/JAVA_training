public class Lab12_0c
{
   public static void main(String[] args)
   {
       String str = "abcde";
       int number;

       if(str.equals("abcde"))
          System.out.println("the same");       // 單行if不需要大括號
       else
          System.out.println("not the same");   // 單行else不需要大括號

       try
       {
          number = Integer.parseInt(str);       // 那麼單行 try 呢
       }
       catch (NumberFormatException e)          // 那麼單行 catch 呢
       {
          System.out.println("Conversion error: " +
                             e.getMessage());
       }
   }
}