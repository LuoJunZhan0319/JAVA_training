import java.util.Scanner;

public class Test50CompositeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input N: ");
		int num = in.nextInt();
		
		
		firstComposite(num);

	}
	


	public static void firstComposite(int x)
	{
		int num = 4; //癬﹍计
		
		
		//璸计竟,玡x借计
		for(int count=0; count<x; num++)
		{
			if(isComposite(num))
			{
				count++;
				System.out.print(num+" : ");
				
				for(int i = 2; i<=num; i++)
				{
					if(num % i == 0)
						System.out.print(i+" ");
				}
				System.out.println();
			}
				
		}
	}
	
	public static boolean isComposite(int num)
	{
		//安砞癬﹍计ぃ琌计
		boolean check = false;
		
		//耞癬﹍计琌计
		for(int init=2 ; init<num; init++)
		{
			//痙琌计靡沮
			if(num % init == 0)
				check = true;
		}
		
		return check;
	}
}
