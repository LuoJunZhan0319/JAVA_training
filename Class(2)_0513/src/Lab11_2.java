public class Lab11_2
{
   public static void main(String[] args)
   {

   }
}
class Parent
{
   public void Parent(){}
}
class Child extends Parent
{
   public Child()
   {
   }

   public void mistake()
   {
      super();            //只能在建構式裡呼叫super();
   }
}