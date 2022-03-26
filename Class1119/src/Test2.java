import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("請輸你的成績: ");
		int score = in.nextInt();
		//Nested decision(巢狀結構)
		if(score<60)
			System.out.println("Your grade is F");
		else 
		{
			if(score<70)
				System.out.println("Your grade is D");
			else
			{
				if(score<80)
					System.out.println("Your grade is C");
				else 
				{
					if(score<90)
						System.out.println("Your grade is B");
					else
						System.out.println("Your grade is A");
				}
			}
		}
		
	}

}
