package other;
public class Lab11_8
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();
      Dog bob = new Dog();

      amanda.toString();     // �S�������w�q�A�qObject���O���~�ӤU�ӡA�]���S���sĶ���~
      amanda.equals(bob);    // �S�������w�q�A�qObject���O���~�ӤU�ӡA�]���S���sĶ���~
      amanda.m1();
      //amanda.m2();           // �S�������w�q�A���sĶ���~
   }
}
class Dog extends Object
{
   public void m1(){}
}
