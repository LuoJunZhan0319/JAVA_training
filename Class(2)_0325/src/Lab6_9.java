public class Lab6_9
{
   public static void main(String[] args)
   {
      String s1 = "amanda";
      String s2 = "amanda";				//5,6會被java任做一個amanda字串，並將記憶體位置給S1,S2參考變數使用。
      String s3 = new String("amanda");	//7,8都會新建立一個amanda字串物件。
      String s4 = new String("amanda");

      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);

      if(s1==s2)
         System.out.println("s1 equal to s2");
      else
         System.out.println("s1 unequal to s2");

      if(s3==s4)
         System.out.println("s3 equal to s4");
      else
         System.out.println("s3 unequal to s4");
   }
}
