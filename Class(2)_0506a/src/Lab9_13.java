public class Lab9_13
{
   public static void main(String[] args)
   {
       Dog a = new Dog(5, "amanda");
       System.out.println(a);			//println(a)���|�޵o�sĶ���~
       a.growUp(2);
       System.out.println(a);			//�I�stoString() ���P��System.out.println(a.toString());!!!!!
       
       String s = a + "hello";			//String s = a.toString() + "hello"; 1 4
       System.out.println(s);			//5
   }
}

class Dog
{
   int age;
   String name;
   public Dog(int a, String s){age = a;name = s;}
   public void growUp(int b){age += b;}
   
   public String toString()				// 2
   {
	   return name+"@"+age;				// 3 
   }
}