public class Lab11_4a
{
   public static void main(String[] args)
   {

   }
}
class Parent1
{
   // java will not add default constructor

   public Parent1(int i)			//竒ΤΤ把计篶Α┮JAVAぃ穦礚把计篶Α
   {i = 10;}

}

class Child1 extends Parent1		//摸常穦箇砞腊摸礚把计篶Α┮тぃ碞穦厨岿
{									//磷よΑΤ㊣Τ把计super(10);┪琌摸礚把计篶Α
   public Child1()					
   {
      // super() added here by java

      System.out.println("hello... I am child");
   }
}