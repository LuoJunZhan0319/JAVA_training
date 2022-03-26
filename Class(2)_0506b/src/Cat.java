public class Cat
{
   String name;
   int age;

   public Cat(String name, int age)
   {
      this.name = name;
      this.age = age;
   }

   public Cat(Cat c)
   {
      name = c.name;
      age = c.age;
   }

   public String toString()
   {
      return name+"("+age+"·³¿ß«})";
   }
}