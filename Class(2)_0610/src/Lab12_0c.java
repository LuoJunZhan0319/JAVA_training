public class Lab12_0c
{
   public static void main(String[] args)
   {
       String str = "abcde";
       int number;

       if(str.equals("abcde"))
          System.out.println("the same");       // ���if���ݭn�j�A��
       else
          System.out.println("not the same");   // ���else���ݭn�j�A��

       try
       {
          number = Integer.parseInt(str);       // ������ try �O
       }
       catch (NumberFormatException e)          // ������ catch �O
       {
          System.out.println("Conversion error: " +
                             e.getMessage());
       }
   }
}