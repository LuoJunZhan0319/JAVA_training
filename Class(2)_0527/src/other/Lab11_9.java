package other;
public class Lab11_9
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();
      Labrador bob = new Labrador();
      Dog carol = new Labrador();     // �inew�l���O�����J�����O�Ѧ��ܼƤ�
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