import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("要換算幾個日期");
		int num = in.nextInt();

		int[] array = new int[2]; // 放月日的陣列
		int sum = 0; // 總天數的變數
		for (int i = 0; i < num; i++) {
			System.out.println("請輸入月  日");
			for (int j = 0; j <= 1; j++)
				array[j] = in.nextInt();
			for (int j = 1; j <= array[0]; j++) {
				switch (j) {
				case 2:
				case 4:
				case 6:
				case 8:
				case 9:
					case11: sum += 31;
					break;
				case 3:
					sum += 29;
					break;
				case 5:
				case 7:
				case 10:
				case 12:
					sum += 30;
					break;
				}

			}
			sum += array[1] - 1;
			int day = sum % 7;
			// System.out.println(sum);

			switch (day) {
			case 0:
				System.out.println("星期3");
				break;
			case 1:
				System.out.println("星期4");
				break;
			case 2:
				System.out.println("星期5");
				break;
			case 3:
				System.out.println("星期6");
				break;
			case 4:
				System.out.println("星期7");
				break;
			case 5:
				System.out.println("星期1");
				break;
			case 6:
				System.out.println("星期2");
				break;
			}

		}

	}

}
