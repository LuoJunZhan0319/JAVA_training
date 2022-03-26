package other;
public class Lab11_12
{
   public static void main(String[] args)
   {
      Dog carol = new Labrador(2, 4, 6);
      printLength(carol);					//1
      carol = new Dog(10, 20);				//5
      printLength(carol);					//6
   }

   public static void printLength(Dog d)	//d: Labrador
   {
      System.out.println(d.getLength());	//2 4 7 9
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
   public double getLength(){return length;}	// 8
}
class Labrador extends Dog
{
   private double tailLength;

   public Labrador(double a, double l, double d)
   {
      super(a, l);
      tailLength = d;
   }
   public double getLength(){return tailLength;} //3
}
