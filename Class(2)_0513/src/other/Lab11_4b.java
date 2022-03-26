package other;
public class Lab11_4b
{
   public static void main(String[] args)
   {
	   Child c = new Child();
   }
}
class Parent
{
   // java自動產生預設建構式
	
	public Parent()
	{
		System.out.println("this is the parent");
	}

}
class Child extends Parent
{
   public Child()
   {
      // super() added here by java

      System.out.println("hello... I am child");
   }
}