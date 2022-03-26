public class P226
{
   public static void main(String[] args)
   {
      int count = 0;
      for (count = 1; count <= 10; count++) 
         System.out.println(count);
      System.out.println("count is now " + count); // ERROR!

      // 迴圈內部是另一個可視層級，範圍小於方法層級
   }
}