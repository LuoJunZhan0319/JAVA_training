import java.util.Scanner;

public class Work18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input thenumber of test data: ");
		int count = in.nextInt();
		
		for(int i = 0; i<count ; i++)
		{
			int identify = 0; //辨別數
			
			int matrix_size = in.nextInt(); //使用者輸入矩陣大小
			
			int [][] array = new int [matrix_size][matrix_size]; //建構2d矩陣
			
			//將使用者資料放到2d陣列
			for(int j = 0; j<matrix_size ; j++)
			{
				for(int z = 0; z<matrix_size ; z++)
				{
					array[j][z] = in.nextInt();
				}
				in.nextLine();
			}
			
			//呼叫辨別方法
			identify = Symmetric(array);
			
			//判斷辨別結果
			if(identify == 0)
				System.out.println("Test#"+i+": Symmetric");
			else
				System.out.println("Test#"+i+": Non-symmetric");
			
		}

	}
	
	
	public static int Symmetric(int[][] array)
	{
		int sum = 0;
		for(int i = 0; i<array.length ; i++)
		{
			for(int j = 0; j<array[0].length ; j++)
			{
				if(array[i][j] == array[array.length-i-1][array[0].length-j-1])
				{
					if(array[i][j] >= 0)
					{
						
					}
					else
					{
						sum -= 1;
						break;
					}
				}
				else
				{
					sum -= 1;
					break;
				}
				
			}
			
		}
		return sum;

	}
 

}
