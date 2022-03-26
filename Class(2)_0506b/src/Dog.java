public class Dog
{
   String name;
   int age;

   public Dog(String name, int age)
   {
      this.name = name;
      this.age = age;
   }

   public Dog(Dog d)
   {
      name = d.name;
      age = d.age;
   }
   public String toString()
   {
      return name+"("+age+"·³ª¯ª¯)";
   }
}