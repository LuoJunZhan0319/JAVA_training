public class Lab9_6a
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog(5);
      System.out.println(amanda.getAge());
      Dog bob = new Dog();
      System.out.println(bob.getAge());
   }
}
class Dog
{
   int age;
   public Dog()
   {
      System.out.println("This is a mistake");
      this(1); 									//�n��this()�I�s�غc���AJAVA�Y����this�e�������L�ʧ@!!!�t��C
   }
   public Dog(int age)
   {
      this.age = age;
   }
   public int getAge()
   {
      return age;
   }
}