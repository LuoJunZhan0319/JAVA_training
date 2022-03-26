import java.util.*;

public class testEfficiency
{
   public static void main(String[] args)
   {
      ArrayList<String> list = new ArrayList<String> ();
      System.out.println(System.currentTimeMillis());

      double t1 = System.currentTimeMillis();
      for(int i = 0; i < 500000; i++)
          list.add("amanda");    //插入末尾
          //list.add(0, "amanda");    //插入開頭
      double t2 = System.currentTimeMillis();

      System.out.println(t2-t1);
   }
}