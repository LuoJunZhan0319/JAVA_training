import java.util.Scanner;
public class Lab6_5
{
   public static void main(String[] args)
   {
      int i = m1();                 // 指定運算子左右型態不相容
      int temp = Math.pow(2,3);     // 指定運算子左右型態不相容
      int number = m2();            // 指定運算子左右型態不相容
      double d = m3();              // m3方法無回傳值
      System.out.println(m3());     // m3方法無回傳值
      System.out.println(m4());
   }

   public static double m1()
   {
      return 20.0;
   }
   public static boolean m2()
   {
      return true;
   }

   public static void m3()
   {
      return;
   }

   public static int m4()
   {
      return 30;
   }
}