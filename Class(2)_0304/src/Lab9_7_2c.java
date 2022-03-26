class Lab9_7_2c
{
   int len;
   double weight;
   boolean male;
   String name;

   public static void main(String[] args)
   {
	   int a = 10;
	   long b = 10;
	   double c = 10;
	   System.out.println(printout(a));
	   System.out.println(printout(b));
	   System.out.println(printout(c));
   }
   
   public static int printout(int i)
   {
      return 5;
   }
   
   public static int printout(long i)
   {
      return 10;
   }
   
   public static int printout(double d)
   {      
      return 15;
   }

}