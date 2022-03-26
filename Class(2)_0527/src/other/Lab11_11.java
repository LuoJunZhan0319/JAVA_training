package other;
public class Lab11_11
{
   public static void main(String[] args)
   {
      Dog carol = new Labrador(2, 4, 6);
      System.out.println(carol.getLength());  // invoke the Labrador's version: tail length
      carol = new Dog(10, 20);
      System.out.println(carol.getLength());  // invoke the Dog's version: length
      
      //������O�X�{overriding�ɡA�l���O��k���|�X�{�sĶ���~�C
      //�åB���k�l�����O����koverriding�A�A�w������O�ܼƩI�s�l���O����overriding��k�ɡA�N�̥H���󪺤�k���D�C
      
      carol.xxx();
      carol.yyy();
      //�A�S��overriding�ɡAJAVA�N�H�ܼƫ��O�Ҿ֦�����k���D
      
   }
}
class Dog
{
   private double age;
   private double length;

   public Dog(double a, double l)
   {
      age = a;
      length = l;
   }
   public double getLength(){return length;}
   
   public void xxx() {}
}


class Labrador extends Dog
{
   private double tailLength;

   public Labrador(double a, double l, double d)
   {
      super(a, l);
      tailLength = d;
   }
   public double getLength(){return tailLength;} // overriding the getLength() from Dog class
   
   public void yyy() {}
}