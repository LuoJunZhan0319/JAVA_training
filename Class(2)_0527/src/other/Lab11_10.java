package other;

import a.Dog;
import a.Labrador;

public class Lab11_10
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();
      Labrador bob = new Labrador();
      Dog carol = new Labrador();							//左邊宣告父類別變數，但實際放入子類別物件

      System.out.println(amanda.getLength());
      System.out.println(amanda.gettailLength());			//錯誤:父類別變數，無法使用子類別方法

      System.out.println(bob.getLength());
      System.out.println(bob.gettailLength());

      System.out.println(carol.getLength());
      System.out.println(carol.gettailLength());           // 編譯時，java依據變數型態決定可使用的方法(換句話說，JAVA不允許宣告父類別的變數，使用子類別的方法)
   }
}
class Dog
{
   private double age;
   private double length;

   public double getLength(){return length;}
}
class Labrador extends Dog
{
   private double tailLength;

   public double gettailLength(){return tailLength;}
}