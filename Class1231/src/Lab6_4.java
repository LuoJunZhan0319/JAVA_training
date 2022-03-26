import java.util.Scanner;
public class Lab6_4
{
   public static void main(String[] args)
   {
      m1();      // 編譯時並不檢查方法呼叫敘述左邊是否存在指定運算子
      m2();
      m3();
   }

   public static int m1()
   {
      // 回傳值型態與標頭指定型態不相容

      return 20.0;
   }
   public static int m2()
   {
      // 回傳值型態與標頭指定型態不相容

      return Math.PI;
   }

   public static void m3()
   {
      // 回傳值型態與標頭指定型態不相容

      return 20;
   }
}