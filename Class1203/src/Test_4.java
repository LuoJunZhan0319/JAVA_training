import java.util.Scanner;

public class Test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入一個正整數");
		int num = in.nextInt();

		while (num < 1 || num > 100) // 也可以寫成while(!(num>=1 && num<=100)) -->!可以簡單想成不是的意思
		{
			System.out.print("請輸入一個正整數");
			num = in.nextInt();
		}
		System.out.print("合格的數是:" + num);

	}

}
