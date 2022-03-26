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
      this(1); 									//要用this()呼叫建構式，JAVA嚴格表明this前面執行其他動作!!!龜毛。
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