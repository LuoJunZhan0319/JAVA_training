import java.util.Scanner;
public class Test9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("�п�J���~�Ƿ~�`���Z: ");
		double num1 = in.nextDouble();
		System.out.println("�п�J�j�@�W�ަ榨�Z: ");
		int num2 = in.nextInt();
		System.out.println("�п�J�j�@�U�ަ榨�Z: ");
		int num3 = in.nextInt();
		System.out.println("�п�J�j�G�W�ަ榨�Z: ");
		int num4 = in.nextInt();
		System.out.println("�п�J�j�G�U�ަ榨�Z: ");
		int num5 = in.nextInt();
		System.out.println("�п�J�j�T�W�ަ榨�Z: ");
		int num6 = in.nextInt();
		System.out.println("�п�J�j�T�U�ަ榨�Z: ");
		int num7 = in.nextInt();

		
		in.nextLine();
		
		System.out.println("�O�_�q�L�^����e ");
		String ans = in.nextLine();
		char c = ans.charAt(0);
		
		if(num1>=80.0 && num2>=80 && num3>=80 && num4>=80 && num5>=80 && num6>=80 && num7>=80 && c == 'y')
		{		
			System.out.println("���ߡA�A�i�H���e���~");				
		}
		else 
			System.out.println("�g�P�w�L�k���e���~");
		
		
	}

}
