package other;
public class Lab11_9
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();
      Labrador bob = new Labrador();
      Dog carol = new Labrador();     // 可new子類別物件放入父類別參考變數中
   }
}
class Dog
{
   private double age;
   private double length;
}
class Labrador extends Dog
{
   private double tailLength;
}