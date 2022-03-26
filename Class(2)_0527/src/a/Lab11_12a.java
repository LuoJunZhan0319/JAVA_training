package a;
public class Lab11_12a
{
   public static void main(String[] args)
   {
      Dog[] dogs = new Dog[3];

      dogs[0] = new Labrador(2, 4, 6);
      dogs[1] = new Dog(10, 20);
      dogs[2] = new Labrador(4, 8, 10);

      for(int i = 0; i < dogs.length; i++)
      {
    	  //instanceof �B��l
    	  
          System.out.print("��"+(i+1)+"��");
          if(dogs[i] instanceof Labrador)
             System.out.println("�O���ԩ�");
          else if(dogs[i] instanceof Dog)
             System.out.println("���O�ԩԡA�O��L����");
          else if(dogs[i] instanceof Object)
             System.out.println("���O�����A�O��L����");
      }
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
}