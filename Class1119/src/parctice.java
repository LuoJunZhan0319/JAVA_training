import java.util.Scanner;
public class parctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		

		char c = 'K';
		
		for (;c != 'N';) //�����Q��for�j�餤�A�P�_�����϶��Ӱ��P�_
		{
			System.out.println("�п�J����: ");
			int num1 = in.nextInt();
			int num2 = in.nextInt();
				
			int sum = num1+num2;
			System.out.println(num1+"+"+num2+"="+sum);
				
			in.nextLine();
				
			System.out.println("�O�_�٭n�~��A��JN�h�����A��l�~�� ");
			String ans = in.nextLine();
			c = ans.charAt(0);
		}
		
	}

}
