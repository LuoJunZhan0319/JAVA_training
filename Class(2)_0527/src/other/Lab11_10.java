package other;

import a.Dog;
import a.Labrador;

public class Lab11_10
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();
      Labrador bob = new Labrador();
      Dog carol = new Labrador();							//����ŧi�����O�ܼơA����ک�J�l���O����

      System.out.println(amanda.getLength());
      System.out.println(amanda.gettailLength());			//���~:�����O�ܼơA�L�k�ϥΤl���O��k

      System.out.println(bob.getLength());
      System.out.println(bob.gettailLength());

      System.out.println(carol.getLength());
      System.out.println(carol.gettailLength());           // �sĶ�ɡAjava�̾��ܼƫ��A�M�w�i�ϥΪ���k(���y�ܻ��AJAVA�����\�ŧi�����O���ܼơA�ϥΤl���O����k)
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