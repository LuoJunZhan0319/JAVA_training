import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ĥ@�D
		double sum = 0;
		for(double i=1, j=5; i<=5; i++, j--)
			sum += (i/j);
		System.out.println("1/5+2/4+3/3+4/2+5/1="+ sum);
		
		
		//�ĤG�D
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int sum1 = 0; 
		for(int i = 1; i<=count; i++)
		{
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			int num3 = num1 - num2;
			System.out.println(Math.abs(num3));
			
		}
		
		
		//�ĤT�D
		System.out.println("�п�J�}�Y�Ʀr:");
		int a = in.nextInt();
		System.out.println("�п�J�}�Y�Ʀr:");
		int b = in.nextInt();
		for(int i = a ; a <= b; a++)
		{
			System.out.println(a+"\t"+(char)a);
		}
		
		}
		
	}


