public class Lab3_4
{
   public static void main(String[] args)
   {
      int average = 49;		// �������Z�F�X�{�b�D�ت��W���N�]���ܼ�
      int amanda = 64;
      double score = 0.0;

      if(average >= 50)
      {
         score = Math.sqrt(amanda);
         score *= 10;
         System.out.println("amanda���Z��"+score);
      }
      
      if(average < 50)
      {
    	 score = amanda;
      	 System.out.println("amanda���Z��"+score);
      }
      
   }
}