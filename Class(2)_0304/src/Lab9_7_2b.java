class Lab9_7_2b
{
   int len;
   double weight;
   boolean male;
   String name;

   public static void main(String[] args)
   {
	   System.out.println(printout(10));  //�|�U�ۧ�̾A�X���Ѽƪ����ϥ�(�κٯS�x����signature)
	   System.out.println(printout(10L)); //�S�x�]�t�F��k�W�B�Ѽ�(�ܼ�)�ӼơB���A�B����
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