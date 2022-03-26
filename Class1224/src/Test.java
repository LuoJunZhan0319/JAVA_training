
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1,4,6,7,9}; //一維陣列
		
		int[][] array2 = {	{1,2,3},
							{4,5,6},
							{7,8,9},
							{10,11,12}  };
		int sum ;
		
		//每橫列加總
		
		for(int i = 0; i<array2.length; i++)
		{
			sum = 0;  //每一橫列加總必須清空(歸零)
			for(int j = 0; j<array2[i].length; j++)
			{
				sum += array2[i][j];
			}
			System.out.println(sum);
		}
		
		
		//每直行加總
		for(int i = 0; i<3; i++)
		{
			sum = 0;  //每一直行加總必須清空(歸零)
			
			for(int j = 0; j<array2.length; j++)
			{
				sum += array2[j][i];
				
			}
			System.out.println(sum);
			
		}
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(array2[0][0]+" "+array2[0][1]+" "+array2[0][2]);
//		
//		System.out.println(array2[1][0]+" "+array2[1][1]+" "+array2[1][2]);
//		
//		System.out.println(array2.length);
//		System.out.println(array2[0].length);
//		System.out.println(array2[1].length);
//		System.out.println(array2[2].length);
//		
//		System.out.println(array2);

	}

}
