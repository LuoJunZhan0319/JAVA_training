package other;
public class Lab11_8
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();
      Dog bob = new Dog();

      amanda.toString();     // 沒有直接定義，從Object類別中繼承下來，因此沒有編譯錯誤
      amanda.equals(bob);    // 沒有直接定義，從Object類別中繼承下來，因此沒有編譯錯誤
      amanda.m1();
      //amanda.m2();           // 沒有直接定義，有編譯錯誤
   }
}
class Dog extends Object
{
   public void m1(){}
}
