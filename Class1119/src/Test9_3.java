import java.util.Scanner;
public class Test9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("�п�J�@�ӤT���: ");
		String num = in.nextLine();
		
		char num1 = num.charAt(0);
		char num2 = num.charAt(1);
		char num3 = num.charAt(2);
		
		if (num1 == num2)
		{
			if (num2 == num3)
			{
				System.out.println("�T�� "+num1);
			}
			else
			{
				System.out.println("�@�� "+num1);
			}
		}
		else
		{
			if (num2 == num3)
			{
				System.out.println("�@�� "+num2);
			}
			else
			{
				if(num1 == num3)
				{
					System.out.println("�@�� "+num1);
				}
				else
					System.out.println("��i "+num1+num2+num3);
			}
		}
	}

}
