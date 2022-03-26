import java.util.Scanner;
public class Test9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("請輸入歷年學業總成績: ");
		double num1 = in.nextDouble();
		System.out.println("請輸入大一上操行成績: ");
		int num2 = in.nextInt();
		System.out.println("請輸入大一下操行成績: ");
		int num3 = in.nextInt();
		System.out.println("請輸入大二上操行成績: ");
		int num4 = in.nextInt();
		System.out.println("請輸入大二下操行成績: ");
		int num5 = in.nextInt();
		System.out.println("請輸入大三上操行成績: ");
		int num6 = in.nextInt();
		System.out.println("請輸入大三下操行成績: ");
		int num7 = in.nextInt();

		
		in.nextLine();
		
		System.out.println("是否通過英文門檻 ");
		String ans = in.nextLine();
		char c = ans.charAt(0);
		
		if(num1>=80.0 && num2>=80 && num3>=80 && num4>=80 && num5>=80 && num6>=80 && num7>=80 && c == 'y')
		{		
			System.out.println("恭喜，你可以提前畢業");				
		}
		else 
			System.out.println("經判定無法提前畢業");
		
		
	}

}
