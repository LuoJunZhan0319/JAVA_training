import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("�п�A�����Z: ");
		int score = in.nextInt();
		//Nested decision(�_�����c)
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
