class Lab9_7_2a
{
   int len;
   double weight;
   boolean male;
   String name;

   public static void main(String[] args)
   {
	   printout(2);
   }
   
   public static void printout(int i)
   {
      i += 2;
   }
   public static int printout(int i, int j)
   {
      i += 3;
      System.out.println("hello");
      
      return 10;
   }

}