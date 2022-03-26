

public class Binary_Search {
	
	public static void main(String[] args) {
		int[] array = {2, 5, 8, 9, 10, 17};
		System.out.print(binarySearch(8,array));
	}
	
	public static int binarySearch(int search, int[] array)
	{
		int left = 0, right = array.length-1;
		
		while(left <= right)
		{
			int pos = (left + right) / 2;		//決定本次比較位置
			if(array[pos] == search)			//在比較位置找到search
			{
				return pos;						//回傳位置
			}
			else if(array[pos] > search)		//當要搜尋的比結果小，限縮範圍在左邊
			{
				right = pos - 1;
			}
			else if(array[pos] < search)		//當要搜尋的比結果大，限縮範圍在右邊
			{
				left = pos + 1;
			}
			
		}
		
		return -1;   							//一旦回傳這個值，代表程式有問題，要再檢查!!!
		
	}

}
