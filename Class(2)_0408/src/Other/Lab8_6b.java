package Other;
public class Lab8_6b
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

   public Dog(){}
   public Dog(int age)
   {
      this.age = age;
   }
   public void setAge()
   {
      this(1);					//this()����غc���A���i��|��b��k�̭��A�]���A�i�H�����k�N����w�g�غc�����F�A�o�޿�ܩ�!!�C
   }
   public int getAge() {return age;}
}