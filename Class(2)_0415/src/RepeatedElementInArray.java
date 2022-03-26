
public class RepeatedElementInArray {

	public static void main(String[] args) {
		
		int[][] array =    {  
					    	{1, 2, 3, 24, 15, 26},
					    	{7, 8, 9, 10, 11, 12},	
					    	{3, 4, 5, 16, 17, 18}
												 };
		
		System.out.println(repeat(array));		// �I�srepeat()��k�P�_����
	}
	
	public static boolean repeat(int[][] array)
	{
		// ���]repeat(int, int, int[][]) �i�H�B�̤E�c����
		//repeat(0, 0, array);          //�B�z���b�䭫��
		//repeat(0, 3, array);          //�B�z�k�b�䭫��
		
		return repeat(0, 0, array) || repeat(0, 3, array); //�I�s25��{���X
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
	
	public static boolean repeat(int x, int[] array)		// �w���mx�i��}�C�����ˬd
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i != x && array[x] == array[i])
			{
				return true;		// �o�{���ƪ��Ҿ�
			}
		}
		
		return false;
	}
	
	public static boolean repeat(int[] array) {		// �w��ǤJ���}�C�i�歫���ˬd
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
//				return true;		// �o�{���ƪ��Ҿ�
//			}
//		}
//		
//		for(int i = 0; i < array.length; i++)
//		{
//			if(i != 1 && array[1] == array[i])
//			{
//				return true;		// �o�{���ƪ��Ҿ�
//			}
//		}
//
//		for(int i = 0; i < array.length; i++)
//		{
//			if(i != 2 && array[2] == array[i])
//			{
//				return true;		// �o�{���ƪ��Ҿ�
//			}
//		}
		
//		return false;

	}

}
