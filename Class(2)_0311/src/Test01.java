
public class Test01 {

	public static void main(String[] args) {
		
		int[] array = {0, 3, 9, 6, 9, 21};
		System.out.print(repeat(array));
		
	}
	
	
	
	
		public static boolean repeat(int[] array)
	{
		// TODO Auto-generated method stub
			
			for(int i = 0; i < array.length;i++)
			{
				if(repeat(i, array))
				{
					return true;
				}
				
			}
			return false;
//		
//		//boolean repeat = false;  //是否重複的證據
//		// int check = array[0];
//		
//		for(int i = 0; i < array.length; i++)
//		{
//			if(i != x &&array[x] == array[i])
//			{
//				return true;
//			}
//			
//		}
//		
//		//check = array[1];
//		
//		for(int i = 0; i < array.length; i++)
//		{
//			if(i != x && array[x] == array[i])
//			{
//				return true;
//			}
//			
//		}
//		
//		//check = array[2];
//		
//		for(int i = 0; i < array.length; i++)
//		{
//			if(i != x && array[x] == array[i])
//			{
//				return true;
//			}
//			
//		}
		
		
//		return false;
	}
	
		
		public static boolean repeat(int x, int[] array)
		{
			for(int i = 0; i < array.length; i++)
			{
				if(i != x &&array[x] == array[i])
				{
					return true;
				}
				
			}
			
			return false;
		}
}
