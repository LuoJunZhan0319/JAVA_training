
public class RepeatedElementInArray {

	public static void main(String[] args) {
		
		int[][] array =    {  
					    	{1, 2, 3, 24, 15, 26},
					    	{7, 8, 9, 10, 11, 12},	
					    	{3, 4, 5, 16, 17, 18}
												 };
		
		System.out.println(repeat(array));		// 呼叫repeat()方法判斷重複
	}
	
	public static boolean repeat(int[][] array)
	{
		// 假設repeat(int, int, int[][]) 可以處裡九宮格資料
		//repeat(0, 0, array);          //處理左半邊重複
		//repeat(0, 3, array);          //處理右半邊重複
		
		return repeat(0, 0, array) || repeat(0, 3, array); //呼叫25行程式碼
	}
	
	public static boolean repeat(int row, int col, int[][] array)
	{
		int[] temp = new int[9];
		
		for(int i = 0; i<=2; i++ )
		{
			
			for(int j = 0; j<=2; j++)
			{
				temp[3 * i + j] = array[row + i][col + j];
			}
		}
		
		return repeat(temp);  //

	}
	
	public static boolean repeat(int x, int[] array)		// 針對位置x進行陣列重複檢查
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i != x && array[x] == array[i])
			{
				return true;		// 發現重複的證據
			}
		}
		
		return false;
	}
	
	public static boolean repeat(int[] array) {		// 針對傳入的陣列進行重複檢查
		// TODO Auto-generated method stub
		
		for(int i = 0; i < array.length; i++)
		{
			if(repeat(i, array))
				return true;
		}
		
		return false;
//		repeat(0, array);
//		repeat(1, array);
//		repeat(2, array);
		
//		for(int i = 0; i < array.length; i++)
//		{
//			if(i != 0 && array[0] == array[i])
//			{
//				return true;		// 發現重複的證據
//			}
//		}
//		
//		for(int i = 0; i < array.length; i++)
//		{
//			if(i != 1 && array[1] == array[i])
//			{
//				return true;		// 發現重複的證據
//			}
//		}
//
//		for(int i = 0; i < array.length; i++)
//		{
//			if(i != 2 && array[2] == array[i])
//			{
//				return true;		// 發現重複的證據
//			}
//		}
		
//		return false;

	}

}
