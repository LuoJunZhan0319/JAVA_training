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
      Parent(); 	//企圖執行父類別建構式，這樣的寫法是不行的喔!! super()
   }


   public void m()
   {
      //Parent();  
   }
}