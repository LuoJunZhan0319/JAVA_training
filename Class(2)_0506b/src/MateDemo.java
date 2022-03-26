public class MateDemo
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog("amanda", 5);
      Dog bob = new Dog("bob", 7);
      Cat garfield = new Cat("garfield", 37);
      Cat kitty = new Cat("kitty", 41);

      Mate m1 = new Mate(amanda, garfield);
      Mate m2 = new Mate(bob, kitty);

      System.out.println(m1);
      System.out.println(m2);

      System.out.println("現在kitty貓取代garfield成為amanda的好友");
      m1.changeMate(kitty);

      System.out.println(m1);

   }
}