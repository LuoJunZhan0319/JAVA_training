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
      this(1);					//this()執行建構式，不可能會放在方法裡面，因為你可以執行方法代表物件已經建構完成了，這邏輯很怪!!。
   }
   public int getAge() {return age;}
}