import java.util.Scanner;



public class Work19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print2DArray(TwoDArraySum(get2DArray(3),get2DArray(3)));
		
	}
	
	
	
	
	
	public static int[][] get2DArray(int dim)
	{
		System.out.println("���U�ӽп�J�}�C����");
		Scanner in = new Scanner(System.in);
		int[][] array = new int [dim][dim];
		
		
		for(int i = 0; i<dim; i++)
		{
			System.out.println("�п�J��"+(i+1)+"��C");
			for(int j = 0; j<dim; j++)
			{
				array[i][j] = in.nextInt();
			}
		}
		return array;
	}
	
	
	public static int[][] TwoDArraySum(int[][] a, int[][] b)
	{
		int[][] array = new int[a.length][a[0].length];
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a[0].length; j++)
			{
				array[i][j] = a[i][j] + b[i][j];
			}
		}
		return array;
	}
	
	public static void print2DArray(int[][] a)
	{
		System.out.println("�L�X3x3 �G���}�C");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a[0].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
