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
    	  //instanceof 運算子
    	  
          System.out.print("第"+(i+1)+"隻");
          if(dogs[i] instanceof Labrador)
             System.out.println("是隻拉拉");
          else if(dogs[i] instanceof Dog)
             System.out.println("不是拉拉，是其他狗狗");
          else if(dogs[i] instanceof Object)
             System.out.println("不是狗狗，是其他物件");
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