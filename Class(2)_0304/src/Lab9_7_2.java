class Lab9_7_2
{
   int len;
   double weight;
   boolean male;
   String name;

   public static void main(String[] args)
   {
	   
   }
   
   public static void printout(int i)  //�R�Aô��(static binding) -->��ܦ���Ӥ�k���W�ٰѼƤ@�ˡA�ϵ{���L�k�T�w�n�ϥΦ��
   {
      i += 2;
   }
   public static void printout(int i)
   {
      i += 3;
      System.out.println("hello");
   }

}