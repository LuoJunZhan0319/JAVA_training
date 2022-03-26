package Other;
public class Lab9_8
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();					//1	//4
      amanda.Dog();								//5
   }											//8
}

// 嘗試將兩個方法分別加上註解

class Dog
{
   public void Dog()							//6    java允許方法跟類別同名
   {
       System.out.println("fake constructor");	//7
   }

   public Dog()									//2	   千萬不要在建構式裡面加入回傳值型態，會變成方法喔!!!
   {
       System.out.println("real constructor");	//3
   }

}