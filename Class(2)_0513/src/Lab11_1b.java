public class Lab11_1b
{
   public static void main(String[] args)
   {

   }
}
class Parent
{
   public Parent(){}
}
class Child extends Parent
{
   public Child()
   {
      Parent(); 	//���ϰ�������O�غc���A�o�˪��g�k�O���檺��!! super()
   }


   public void m()
   {
      //Parent();  
   }
}