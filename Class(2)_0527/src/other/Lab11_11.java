package other;
public class Lab11_11
{
   public static void main(String[] args)
   {
      Dog carol = new Labrador(2, 4, 6);
      System.out.println(carol.getLength());  // invoke the Labrador's version: tail length
      carol = new Dog(10, 20);
      System.out.println(carol.getLength());  // invoke the Dog's version: length
      
      //當父類別出現overriding時，子類別方法不會出現編譯錯誤。
      //並且當方法子父類別的方法overriding，再針對父類別變數呼叫子類別物件的overriding方法時，將依以物件的方法為主。
      
      carol.xxx();
      carol.yyy();
      //再沒有overriding時，JAVA將以變數型別所擁有的方法為主
      
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