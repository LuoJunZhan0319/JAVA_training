public class Lab9_4
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog();

      amanda.printout();
   }
}

class Dog
{
   int len;
   double weight;
   boolean male;
   String name;
//   
//   //���java�����n�D�C�����O���n���غc��(�S���N�ΤU�C�w�]!!)
//   // ------------------------------
//   /* default contructor���P�G
//      public Dog()
//      {
//         len = 0;
//         weight = 0.0;
//         male = false;
//         name = null;
//      }
//   */
//   // ------------------------------
//
   public void printout()
   {
      System.out.println(name+"'s len = "+len);
      System.out.println(name+"'s weight = "+weight);

      if(male)
         System.out.println(name+"is a boy");
      else
         System.out.println(name+"is a girl");
   }
}