class Lab9_7_2b
{
   int len;
   double weight;
   boolean male;
   String name;

   public static void main(String[] args)
   {
	   System.out.println(printout(10));  //穦т程続把计セㄏノ(┪嘿疭紉场だsignature)
	   System.out.println(printout(10L)); //疭紉よ猭把计(跑计)计篈抖
	   System.out.println(printout(10.0));
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