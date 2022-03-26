public class Lab3_4
{
   public static void main(String[] args)
   {
      int average = 49;		// 平均成績；出現在題目的名詞就設成變數
      int amanda = 64;
      double score = 0.0;

      if(average >= 50)
      {
         score = Math.sqrt(amanda);
         score *= 10;
         System.out.println("amanda成績為"+score);
      }
      
      if(average < 50)
      {
    	 score = amanda;
      	 System.out.println("amanda成績為"+score);
      }
      
   }
}