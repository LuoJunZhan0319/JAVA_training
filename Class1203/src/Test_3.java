import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("請輸入一個正整數");
		int num = in.nextInt();
		int sum = 0;
		while (num != 0) // 它只需要條件判斷區段，只要符合它就會一直做一直做，直到條件不再符合為止!!!!!
		{
			sum += num;
			System.out.print("請繼續輸入一個正整數");
			num = in.nextInt();
		}
		System.out.print("您所輸入的總和~~ " + sum);

	}

}
