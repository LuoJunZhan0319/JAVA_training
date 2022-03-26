public class Lab11_8a
{
   public static void main(String[] args)
   {
      Dog dog1 = new Dog("amanda", 10);
      Dog dog2 = new Dog("amanda", 10);

      System.out.println(dog1.toString());  // 即使Dog類別沒有定義toString，仍然可以執行
      System.out.println(dog2.toString());

      if(dog1.equals(dog2))                 // 即使Dog類別沒有定義equals，仍然可以執行
         System.out.println("they are the same");
      else
         System.out.println("they are different");
   }
}
class Dog
{
   String name;
   int length;

   public Dog(String name, int length)
   {
      this.name = name;
      this.length = length;
   }
   
   public boolean equals(Dog d)		//overriding Object類別中的equals()
   {
      boolean result = false;

      if(this.name.equals(d.name))
         result = true;
      else
         result = false;

      return result;
   }

   public String toString()			//overriding Object類別中的toString()
   {
      return name + ":身長為" + length;
   }
   
}