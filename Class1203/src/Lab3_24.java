public class Lab3_24 {
	public static void main(String[] args) {
		System.out.printf("%f\n", 2.345);

		// 請設定精準度: 1位小數

		System.out.printf("%.1f\n", 2.345);

		// 請設定精準度: 2位小數；注意進位的四捨五入

		System.out.printf("%.2f\n", 2.345);

		// 請設定欄寬=10

		System.out.printf("%10.2f\n", 2.345);

		// 設定欄寬=6

		System.out.printf("%6.2f\n", 2.345);

		int number = 20;

		// 整數也能設定欄寬

		System.out.printf("%10d\n", number);

		// 整數可以設精準度嗎?

		System.out.printf("%10.2d\n", number);

		// ANS:不行!!!

	}
}