package IIDS;

public class Lab9_1a
{
   public static void main(String[] args)
   {
       Dog amanda = new Dog();
       Dog bob = new Dog();

       Dog.number = 20;
       System.out.println(Dog.number);
       System.out.println(amanda.number);   //���O�ܼƥi�z�L�����O������ӨϥΨ�ȡC
       System.out.println(bob.number);
       amanda.number++;
       System.out.println(Dog.number);
       System.out.println(amanda.number);
       System.out.println(bob.number);
       bob.number -= 10;
       System.out.println(Dog.number);
       System.out.println(amanda.number);
       System.out.println(bob.number);
   }
}

class Dog
{
   static int number;
}