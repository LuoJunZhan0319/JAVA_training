public class Lab9_1_1
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();

      // 逐行打開註解
      //amanda.test1();
      //amanda.test2();
   }
}

class Dog
{
   private int len;

   public void test1(){
	   test2();
   }
   private void test2(){}   //如果test2只有要給test1呼叫使用，就可以使private可以使該方法不被主程式呼叫。
}