public class Lab11_3
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
      System.out.println("Erroneous first line");
      super();										//這邊跟this()的感覺有點像，使用super()呼叫父類別建構式前，前面不能有其他程式
   }
}