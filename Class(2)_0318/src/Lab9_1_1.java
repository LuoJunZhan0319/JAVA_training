public class Lab9_1_1
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();

      // �v�楴�}����
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
   private void test2(){}   //�p�Gtest2�u���n��test1�I�s�ϥΡA�N�i�H��private�i�H�ϸӤ�k���Q�D�{���I�s�C
}