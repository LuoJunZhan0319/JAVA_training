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
//   //其實java都有要求每個類別的要有建構式(沒有就用下列預設!!)
//   // ------------------------------
//   /* default contructor等同：
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