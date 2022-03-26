public class Lab11_8a
{
   public static void main(String[] args)
   {
      Dog dog1 = new Dog("amanda", 10);
      Dog dog2 = new Dog("amanda", 10);

      System.out.println(dog1.toString());  // �Y��Dog���O�S���w�qtoString�A���M�i�H����
      System.out.println(dog2.toString());

      if(dog1.equals(dog2))                 // �Y��Dog���O�S���w�qequals�A���M�i�H����
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
   
   public boolean equals(Dog d)		//overriding Object���O����equals()
   {
      boolean result = false;

      if(this.name.equals(d.name))
         result = true;
      else
         result = false;

      return result;
   }

   public String toString()			//overriding Object���O����toString()
   {
      return name + ":������" + length;
   }
   
}