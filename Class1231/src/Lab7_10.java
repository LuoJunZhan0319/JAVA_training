public class Lab7_10
{
   public static void main(String[] rgs) // �ܼƦW�٥i�ѵ{���]�p�v�ۭq
                                         // �o�̤��@�w�n�gargs
   {

      // �W�b�{�����Afor�j��O���ӧO�}�C���Ѧ��ܼ�(subject1, subject2)�Ө��ΰ}�C����

      int[] subject1 = {60, 70, 30, 80, 90};
      int[] subject2 = {90, 70, 55, 70};

      avgArray(subject1,"�@");
      avgArray(subject2,"�G");
      

   }
   
   public static void avgArray(int[] array,String a)
   {
	   int sum = 0;
	      for(int i = 0; i < array.length; i++)
	      {
	         sum += array[i];
	      }
	      System.out.println("��"+a+"�쥭��="+sum / array.length);
	      
	   
   }
}