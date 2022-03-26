public class Lab11_1a
{
   public static void main(String[] args)
   {
	   Child c = new Child();
	   System.out.println(c.getP1());
   }
}
class Parent
{
   private int p1;
   //public int p1;

   public void setP1(int temp){p1 = temp;}
   public int getP1() {return p1;}
}
class Child extends Parent
{
   public Child()
   {
      //p1 = 10;    
      setP1(10);
   }
}