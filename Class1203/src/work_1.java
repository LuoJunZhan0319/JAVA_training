import java.util.Scanner;

public class work_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int score = in.nextInt();

//		if(score>=0 && score<60)
//		{
//		
//		    switch (score) 
//			{
//			    default:
//				System.out.print("your grade is f");
//			}
//		}
//		else if(score>=60 && score<70)
//		{
//			switch (score) 
//			{
//			    default:
//				System.out.print("your grade is d");
//			}
//		}
//		else if(score>=70 && score<80)
//		{
//			switch (score) 
//			{
//			    default:
//				System.out.print("your grade is c");
//			}
//		}
//		else if(score>=80 && score<90)
//		{
//			switch (score) 
//			{
//			    default:
//				System.out.print("your grade is b");
//			}
//		}
//		else 
//		{
//			switch (score) 
//			{
//			    default:
//				System.out.print("your grade is a");
//			}
//		}
//		
//	

		///////////////////////////////////////////////////////////////
//		int level = 0;
//		
//		if(score>=0 && score<60)
//		{
//			level = 1;
//		}
//		else if(score>=60 && score<70)
//		{
//			level = 2;
//		}
//		else if(score>=70 && score<80)
//		{
//			level = 3;
//		}
//		else if(score>=80 && score<90)
//		{
//			level = 4;
//		}
//		else 
//		{
//			level = 5;
//		}

//		switch(level)
//		{
//		
//		case 1:
//			System.out.print("your grade is f");
//			break;
//		case 2:
//			System.out.print("your grade is d");
//			break;
//		case 3:
//			System.out.print("your grade is c");
//			break;
//		case 4:
//			System.out.print("your grade is b");
//			break;
//		case 5:
//			System.out.print("your grade is a");
//			break;
//		}

		//////////////////////////////////////////////////////////////

		int a = score / 10;

		switch (a) {
		case 10:
			System.out.print("your grade is a");
			break;
		case 9:
			System.out.print("your grade is a");
			break;
		case 8:
			System.out.print("your grade is b");
			break;
		case 7:
			System.out.print("your grade is c");
			break;
		case 6:
			System.out.print("your grade is d");
			break;
		default:
			System.out.print("your grade is f");
			break;
		}

	}

}
