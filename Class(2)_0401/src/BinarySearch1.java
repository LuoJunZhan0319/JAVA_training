import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {
				{4, 14, 15, 18, 99},
				{1, 5, 6, 8, 10},
				{11, 13, 17, 20, 22},
				{2, 7, 9, 12, 23}
		};
		
		Scanner in = new Scanner(System.in);
		System.out.print("�п�J�n�j�M�����(-99�N����)�G");
		int user = in.nextInt();
		
		while(user != -99)
		{			
			int row = binarySearchIn2D(user, array);
			System.out.println(row != -1? user+"�X�{�b��"+row+"�C":user+"�䤣��");
				
			System.out.print("�п�J�n�j�M�����(-99�N����)�G");
			user = in.nextInt();
		}
	}
	
	public static int binarySearchIn2D(int search, int[][] array)
	{
		for(int row = 0; row <= (array.length - 1); row++)
		{
			int left = 0, right = array[0].length - 1;
			
			while(left <= right)
			{
				int pos = (left+right)/2;
				if(search == array[row][pos])
				{
					return row;
				}
				else if(search > array[row][pos])
				{
					left = pos + 1;
				}
				else
				{
					right = pos - 1;
				}
			}
		}
		// �Щ󦹶�J���׵{���X
		return -1;
	}
	
	public static int BinarySearch(int search, int[] array)
	{
		
		int left = 0, right = array.length-1;
		
		while(left <= right)
		{
			int x = (left+right)/2;
			if(search == array[x])
			{
				return x;
			}
			else if(search > array[x])
			{
				left = x + 1;
			}
			else
			{
				right = x - 1;
			}
		}
		
		return -1;
	}

}
