public class Lab6_9
{
   public static void main(String[] args)
   {
      String s1 = "amanda";
      String s2 = "amanda";				//5,6�|�Qjava�����@��amanda�r��A�ñN�O�����m��S1,S2�Ѧ��ܼƨϥΡC
      String s3 = new String("amanda");	//7,8���|�s�إߤ@��amanda�r�ꪫ��C
      String s4 = new String("amanda");

      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);

      if(s1==s2)
         System.out.println("s1 equal to s2");
      else
         System.out.println("s1 unequal to s2");

      if(s3==s4)
         System.out.println("s3 equal to s4");
      else
         System.out.println("s3 unequal to s4");
   }
}
