package other;
public class Lab9_2
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();
      amanda.setLen(20);

      System.out.println(amanda.getLen());
   }
}

class Dog
{
   int len;

   public void setLen(int i)
   {
      // 移除下行註解後執行
      int len;			//遮蔽效應。
      len = i;
   }

   public int getLen()
   {
      return len;
   }
}