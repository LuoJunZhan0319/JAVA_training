public class Lab3_5
{
   public static void main(String[] args)
   {
      char c1 = 'A'; //65
      char c2 = 'D'; //68

      if(c1 > c2)
         System.out.println("編碼數字相差"+(c1-c2));
      if(c2 > c1)
         System.out.println("編碼數字相差"+(c2-c1)); //相減兩字元的內碼
      if(c2 == c1)
         System.out.println("編碼數字相等");

   }
}