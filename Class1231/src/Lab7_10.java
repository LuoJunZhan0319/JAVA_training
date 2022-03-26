public class Lab7_10
{
   public static void main(String[] rgs) // 變數名稱可由程式設計師自訂
                                         // 這裡不一定要寫args
   {

      // 上半程式中，for迴圈是拿個別陣列的參考變數(subject1, subject2)來取用陣列元素

      int[] subject1 = {60, 70, 30, 80, 90};
      int[] subject2 = {90, 70, 55, 70};

      avgArray(subject1,"一");
      avgArray(subject2,"二");
      

   }
   
   public static void avgArray(int[] array,String a)
   {
	   int sum = 0;
	      for(int i = 0; i < array.length; i++)
	      {
	         sum += array[i];
	      }
	      System.out.println("第"+a+"科平均="+sum / array.length);
	      
	   
   }
}